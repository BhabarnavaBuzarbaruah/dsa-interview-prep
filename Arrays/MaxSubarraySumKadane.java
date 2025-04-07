// Problem: https://leetcode.com/problems/maximum-subarray/
// Approach: Kadane's Algorithm - Time: O(n), Space: O(1)

public class MaxSubarraySumKadane {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int result = new MaxSubarraySumKadane().maxSubArray(nums);
        System.out.println("Maximum Subarray Sum: " + result); // Output: 6
    }
}
