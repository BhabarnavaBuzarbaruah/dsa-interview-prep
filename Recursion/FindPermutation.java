/ File: FindPermutation.java
// Description: Java program to print all permutations of a given string using recursion and backtracking
public class FindPermutation {

    // Recursive function to generate all permutations of the given string
    public static void findPermutation(String str, String ans) {
        // Base case: when the input string becomes empty
        if (str.length() == 0) {
            System.out.println(ans); // Print the formed permutation
            return;
        }

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i); // Current character to include in the answer

            // Create a new string without the current character
            String newStr = str.substring(0, i) + str.substring(i + 1);

            // Recursive call with the updated string and answer
            findPermutation(newStr, ans + curr); // Backtracking step
        }
    }

    // Main method to test the permutation function
    public static void main(String[] args) {
        String str = "abc"; // Input string

        System.out.println("All permutations of \"" + str + "\":");
        findPermutation(str, "");
    }
}
