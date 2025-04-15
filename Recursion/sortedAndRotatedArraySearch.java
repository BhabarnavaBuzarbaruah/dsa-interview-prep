// SortedAndRotatedArraySearch.java
// Problem: Search for a target in a sorted and rotated array using recursion
// Recursive function to search in a sorted and rotated array
    public static int sortedAndRotatedArraySearch(int nums[], int target, int si, int ei) {
        // Base case: if search indices cross, target is not found
        if (si > ei) {
            return -1;
        }

        int mid = si + (ei - si) / 2;

        // If the middle element is the target, return its index
        if (nums[mid] == target) {
            return mid;
        }

        // Check if the left half is sorted
        if (nums[si] <= nums[mid]) {
            // Target lies in the left sorted half
            if (nums[si] <= target && target <= nums[mid]) {
                return sortedAndRotatedArraySearch(nums, target, si, mid - 1);
            } else { // Target lies in the right unsorted half
                return sortedAndRotatedArraySearch(nums, target, mid + 1, ei);
            }
        } 
        // Otherwise, right half is sorted
        else {
            // Target lies in the right sorted half
            if (nums[mid] <= target && target <= nums[ei]) {
                return sortedAndRotatedArraySearch(nums, target, mid + 1, ei);
            } else { // Target lies in the left unsorted half
                return sortedAndRotatedArraySearch(nums, target, si, mid - 1);
            }
        }
    }
