// File: KeypadCombinations.java
// Description: Java program to print all possible words from a digit string based on mobile keypad mappings
import java.util.Scanner;

public class KeypadCombinations {

    // Mapping of digits to corresponding characters on a mobile keypad
    static String keypad[] = {
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };

    /**
     * Recursive function to generate all possible words from the digit string
     * 
     * Time Complexity: O(4^n) where n is the length of the input string
     * Space Complexity: O(n) for recursion stack
     *
     * @param s   The remaining digit string
     * @param ans The current accumulated result
     */
    public static void possibleWords(String s, String ans) {
        // Base case: when the string is fully processed
        if (s.length() == 0) {
            System.out.println(ans);
            return;
        }

        // Get the characters corresponding to the current digit
        String key = keypad[s.charAt(0) - '0'];

        // Iterate through each character and make a recursive call
        for (int i = 0; i < key.length(); i++) {
            possibleWords(s.substring(1), ans + key.charAt(i));
        }
    }

    // Main method to get user input and print all combinations
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter digit string (e.g., 23): ");
        String s = sc.next();

        System.out.println("Possible words from keypad:");
        possibleWords(s, "");

        sc.close();
    }
}
