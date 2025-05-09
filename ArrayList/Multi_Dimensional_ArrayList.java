import java.util.ArrayList;

public class Multi_Dimensional_ArrayList {

    /**
     * Demonstrates creation and traversal of a multi-dimensional ArrayList.
     * Time Complexity: O(n * m) where n = number of inner lists, m = number of elements in each list
     * Space Complexity: O(n * m)
     */
    public static void main(String[] args) {
        // Creating a multi-dimensional ArrayList (ArrayList of ArrayLists)
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        // Initialize three inner lists
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        // Add inner lists to the main list
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        // Populate inner lists with sample data
        for (int i = 1; i <= 5; i++) {
            list1.add(i * 1);  // [1, 2, 3, 4, 5]
            list2.add(i * 2);  // [2, 4, 6, 8, 10]
            list3.add(i * 3);  // [3, 6, 9, 12, 15]
        }

        // Traversing and printing the multi-dimensional list
        System.out.println("Printing multi-dimensional ArrayList:");
        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }

        // Printing the entire structure at once
        System.out.println("\nFull structure: " + mainList);
    }
}
