// BinarySearch.java
// Recursive implementation of binary search algorithm
/ Recursive method to perform binary search
    public static int binarySearch(int nums[], int si, int ei, int target) {
        // Base case: if the start index exceeds end index, target is not found
        if (si > ei) {
            return -1;
        }

        // Calculate mid to avoid integer overflow
        int mid = si + (ei - si) / 2;

        // Check if mid element is the target
        if (nums[mid] == target) {
            return mid; // Target found, return index
        }

        // If target is smaller than mid, search in the left half
        if (nums[mid] > target) {
            return binarySearch(nums, si, mid - 1, target);
        }

        // If target is greater than mid, search in the right half
        return binarySearch(nums, mid + 1, ei, target);
    }
