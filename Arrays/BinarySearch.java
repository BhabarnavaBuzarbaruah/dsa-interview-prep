// Problem: https://leetcode.com/problems/binary-search/
// Approach: Iterative Binary Search - Time: O(log n), Space: O(1)

public class BinarySearch {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1; // target not found
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;

        int result = new BinarySearch().search(nums, target);
        System.out.println("Target found at index: " + result); // Output: 4
    }
}
