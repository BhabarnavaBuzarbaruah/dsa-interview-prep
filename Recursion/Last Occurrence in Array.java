// Last_Occurence_in_Array.java
// Problem: Find the last occurrence index of a target element in the array using recursion
public static int lastOccurence(int nums[], int index, int target) {
        // Base case: If we've reached the end of the array
        if (index == nums.length) {
            return -1;
        }

        // Recursive call to check the rest of the array
        int isFound = lastOccurence(nums, index + 1, target);

        // Backtracking: if found in the deeper call, return it
        if (isFound != -1) {
            return isFound;
        }

        // Otherwise, check current index
        if (nums[index] == target) {
            return index;
        }

        // If not found
        return -1;
    }
