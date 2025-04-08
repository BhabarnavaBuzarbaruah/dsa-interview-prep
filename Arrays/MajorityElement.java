// Problem: Find the majority element (element that appears more than n/2 times)
// Assumption: The input array always contains a majority element
// Approach: Moore’s Voting Algorithm
public static int findMajorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        // First pass: Find a candidate for majority
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];  // Assume current element is majority
                count = 1;
            } else if (nums[i] == candidate) {
                count++;  // Increase count for the same candidate
            } else {
                count--;  // Decrease count for a different number
            }
        }

        // Second pass (optional if majority element is guaranteed)
        // Count the frequency of the candidate
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        // Check if it's actually the majority
        if (count > nums.length / 2) {
            return candidate;
        } else {
            return -1;  // In case no majority element exists (not expected in this version)
        }
    }
