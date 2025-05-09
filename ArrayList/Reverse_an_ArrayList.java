import java.util.ArrayList;
import java.util.Collections;

public class Reverse_an_ArrayList {

    /**
     * Demonstrates how to reverse an ArrayList using Collections.reverse().
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static void main(String[] args) {
        // Create and populate the ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original List: " + list);

        // Reverse the list in-place
        Collections.reverse(list);

        System.out.println("Reversed List: " + list);
    }
}
