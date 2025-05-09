import java.util.ArrayList;
import java.util.Collections;

public class Lonely_Numbers_in_ArrayList {

    /**
     * Finds all lonely numbers in the given list.
     * A lonely number is defined as a number that occurs only once
     * and has no adjacent numbers (num - 1 or num + 1) in the list.
     *
     * Time Complexity: O(n log n) due to sorting
     * Space Complexity: O(n) for result list
     *
     * @param list - input list of integers
     * @return a list of lonely numbers
     */
    public static ArrayList<Integer> lonelyNumbers(ArrayList<Integer> list) {
        Collections.sort(list); // Sort the list for easy comparison
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            int curr = list.get(i);

            // Check if the current number is unique
            boolean isUnique = (i == 0 || !list.get(i).equals(list.get(i - 1))) &&
                               (i == list.size() - 1 || !list.get(i).equals(list.get(i + 1)));

            // Check if adjacent numbers are not present
            boolean noAdjacent = (i == 0 || list.get(i - 1) != curr - 1) &&
                                 (i == list.size() - 1 || list.get(i + 1) != curr + 1);

            if (isUnique && noAdjacent) {
                result.add(curr);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);

        // Expected Output: [8, 10]
        System.out.println("Lonely numbers: " + lonelyNumbers(list));
    }
}
