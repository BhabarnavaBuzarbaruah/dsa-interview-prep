// Brute-force and optimized solutions for the "Container With Most Water" problem.
// Problem: Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai).
// n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
// Find two lines, which together with the x-axis forms a container, such that the container contains the most water.

public class Container_with_most_water {

    /**
     * Brute-force approach to find the maximum water that can be trapped.
     * Time Complexity: O(n^2)
     * Space Complexity: O(1)
     *
     * @param list - list of non-negative integers representing the height of lines.
     * @return the maximum amount of water a container can store.
     */
    public static int totalTrappedWater(ArrayList<Integer> list) {
        int maxWater = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int width = j - i;
                int ht = Math.min(list.get(i), list.get(j));
                int currWater = ht * width;
                maxWater = Math.max(currWater, maxWater);
            }
        }
        return maxWater;
    }

    /**
     * Optimized two-pointer approach to solve the problem.
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     *
     * @param list - list of non-negative integers representing the height of lines.
     * @return the maximum amount of water a container can store.
     */
    public static int containerWithMostWater(ArrayList<Integer> list) {
        int left = 0, right = list.size() - 1;
        int maxWater = 0;
        while (left < right) {
            int width = right - left;
            int ht = Math.min(list.get(left), list.get(right));
            int currWater = ht * width;
            maxWater = Math.max(currWater, maxWater);

            // Move the pointer pointing to the shorter line inward
            if (list.get(left) < list.get(right)) {
                left++;
            } else {
                right--;
            }
        }
        return maxWater;
    }

    // Main method to test both approaches
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        // Output from brute-force approach
        System.out.println("Brute-force approach result: " + totalTrappedWater(list));

        // Output from optimized two-pointer approach
        System.out.println("Two-pointer approach result: " + containerWithMostWater(list));
    }
}
