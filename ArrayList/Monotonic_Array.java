import java.util.ArrayList;

public class Monotonic_Array {

    /**
     * Checks if the given list is monotonic.
     * A list is monotonic if it is either entirely non-increasing or non-decreasing.
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     *
     * @param list - list of integers
     * @return true if the list is monotonic, false otherwise
     */
    public static boolean isMonotonicArrayList(ArrayList<Integer> list) {
        boolean increasing = false;
        boolean decreasing = false;

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) < list.get(i + 1)) {
                increasing = true;
            } else if (list.get(i) > list.get(i + 1)) {
                decreasing = true;
            }

            // Early exit: if both increasing and decreasing are true
            if (increasing && decreasing) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(2);

        // Output: false (not strictly increasing or decreasing)
        System.out.println("Is Monotonic: " + isMonotonicArrayList(list));
    }
}
