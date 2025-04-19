// File: MergeSort.java
// Description: Java program to implement Merge Sort on an integer array
public class MergeSort {

    // Function to print the array
    public static void printArray(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    // Merge Sort function to sort the array using divide-and-conquer
    public static void mergeSort(int nums[], int si, int ei) {
        if (si >= ei) {
            return; // Base case: single element is already sorted
        }

        int mid = si + (ei - si) / 2;

        // Recursively sort the left part of the array
        mergeSort(nums, si, mid);

        // Recursively sort the right part of the array
        mergeSort(nums, mid + 1, ei);

        // Merge the sorted parts
        merge(nums, si, mid, ei);
    }

    // Merge function to combine two sorted halves
    public static void merge(int nums[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1]; // Temporary array to store merged result
        int i = si;       // Iterator for left part
        int j = mid + 1;  // Iterator for right part
        int k = 0;        // Iterator for temp array

        // Compare and merge elements from both halves
        while (i <= mid && j <= ei) {
            if (nums[i] < nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        // Copy remaining elements from left half
        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        // Copy remaining elements from right half
        while (j <= ei) {
            temp[k++] = nums[j++];
        }

        // Copy sorted elements back to the original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            nums[i] = temp[k];
        }
    }

    // Main method to run and test the Merge Sort
    public static void main(String[] args) {
        int nums[] = {6, 3, 9, 5, 2, 8};

        // Apply merge sort on the array
        mergeSort(nums, 0, nums.length - 1);

        // Print the sorted array
        System.out.print("Sorted Array: ");
        printArray(nums);
    }
}
