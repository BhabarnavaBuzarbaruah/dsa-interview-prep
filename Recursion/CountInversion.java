// File: CountInversion.java
// Description: Java program to count the number of inversions in an array using merge sort
public class CountInversion {

    // Function to count inversions using modified merge sort
    public static int mergeSort(int arr[], int si, int ei) {
        if (si < ei) {
            // Find the middle index
            int mid = si + (ei - si) / 2;

            // Count inversions in left half
            int leftInvCount = mergeSort(arr, si, mid);

            // Count inversions in right half
            int rightInvCount = mergeSort(arr, mid + 1, ei);

            // Count split inversions while merging both halves
            int inversionCount = merge(arr, si, mid, ei);

            // Total inversions is sum of all three parts
            return leftInvCount + rightInvCount + inversionCount;
        }
        return 0; // No inversion in a single element
    }

    // Merge function that also counts inversions
    public static int merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1]; // Temporary array for merging
        int i = si;      // Pointer for left subarray
        int j = mid + 1; // Pointer for right subarray
        int k = 0;       // Pointer for temp array
        int inversionCount = 0;

        // Merge two sorted subarrays and count inversions
        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                k++; i++;
            } else {
                temp[k] = arr[j];
                k++; j++;
                inversionCount += (mid - i + 1); // Count inversions
            }
        }

        // Copy remaining elements from left subarray
        while (i <= mid) {
            temp[k] = arr[i];
            k++; i++;
        }

        // Copy remaining elements from right subarray
        while (j <= ei) {
            temp[k] = arr[j];
            k++; j++;
        }

        // Copy merged elements back to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }

        return inversionCount;
    }

    // Main function to test the program
    public static void main(String args[]) {
        int arr[] = {6, 3, 5, 2, 7};
        System.out.print("Inversion Count: " + mergeSort(arr, 0, arr.length - 1));
    }
}
