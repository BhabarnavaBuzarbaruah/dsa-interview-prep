// Problem: https://leetcode.com/problems/container-with-most-water/
// Approach: Two Pointers - Time: O(n), Space: O(1)

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;

        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int w = right - left;
            max = Math.max(max, h * w);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int result = new ContainerWithMostWater().maxArea(height);
        System.out.println("Max area: " + result); // Output: 49
    }
}
