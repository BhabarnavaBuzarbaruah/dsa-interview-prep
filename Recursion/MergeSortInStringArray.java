// File: MergeSortInStringArray.java
// Description: Java program to perform merge sort on an array of strings
public class MergeSortInStringArray {

    // Utility method to print an array
    public static void printArray(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Main merge sort function that recursively divides the array
    public static void mergeSort(String arr[], int si, int ei) {
        if (si >= ei) {
            return; // Base case: single element is already sorted
        }

        int mid = si + (ei - si) / 2;

        // Sort the left half
        mergeSort(arr, si, mid);

        // Sort the right half
        mergeSort(arr, mid + 1, ei);

        // Merge the two sorted halves
        merge(arr, mid, si, ei);
    }

    // Merge two sorted halves of the array
    public static void merge(String arr[], int mid, int si, int ei) {
        String temp[] = new String[ei - si + 1]; // Temporary array for merging
        int i = si;      // Pointer for left half
        int j = mid + 1; // Pointer for right half
        int k = 0;       // Pointer for temp array

        // Merge while comparing strings lexicographically
        while (i <= mid && j <= ei) {
            if (arr[i].compareTo(arr[j]) <= 0) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from the left half
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements from the right half
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy sorted elements back into the original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    // Main method to test the merge sort
    public static void main(String[] args) {
        String arr[] = { "sun", "earth", "mars", "mercury" };

        // Call merge sort on the entire array
        mergeSort(arr, 0, arr.length - 1);

        // Print the sorted array
        System.out.print("Sorted Array: ");
        printArray(arr);
    }
}
