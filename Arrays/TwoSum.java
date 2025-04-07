// Problem: https://leetcode.com/problems/two-sum/
// Approach: HashMap - Time: O(n), Space: O(n)

import java.util.*;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1}; // if not found
    }
}
