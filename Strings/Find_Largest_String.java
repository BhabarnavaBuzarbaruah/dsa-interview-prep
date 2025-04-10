// This program finds the lexicographically largest string in an array of strings.

public class Find_Largest_String {

    // Method to find the largest string (lexicographically)
    public static String findLargest(String fruits[]) {
        // Initialize 'largest' with the first element
        String largest = fruits[0];

        // Compare with other elements in the array
        for (int i = 1; i < fruits.length; i++) {
            // If current string is greater, update 'largest'
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }

        // Return the largest string
        return largest;
    }
