mport java.util.ArrayList;

public class Pair_Sum {

    /**
     * Checks if there exists a pair of elements in a sorted list whose sum equals the target.
     * Uses the two-pointer technique.
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     *
     * @param list - sorted ArrayList of integers
     * @param target - target sum to find
     * @return true if a valid pair is found, false otherwise
     */
    public static boolean findPairSum(ArrayList<Integer> list, int target) {
        int left = 0, right = list.size() - 1;

        while (left < right) {
            int sum = list.get(left) + list.get(right);

            if (sum == target) {
                return true; // Found a valid pair
            }

            // Move the pointers based on current sum
            if (sum < target) {
                left++; // Need a larger sum
            } else {
                right--; // Need a smaller sum
            }
        }

        return false; // No valid pair found
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Fill the list with sorted numbers: [1, 2, 3, 4, 5, 6]
        for (int i = 1; i <= 6; i++) {
            list.add(i);
        }

        int target = 5;

        // Output: true (because 2 + 3 = 5)
        System.out.println("Does a pair exist with sum " + target + "? " + findPairSum(list, target));
    }
}
