// This program finds the first non-repeating character in a string.

public class First_NonRepeating_Character {

    // Method to return the first non-repeating character from the string
    public static char firstNonRepeatingCharacter(String str) {
        str = str.toLowerCase();  // Convert to lowercase to handle case-insensitive comparison

        int countChar[] = new int[26]; // Array to count frequency of each character (a-z)

        // First pass: Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            countChar[ch - 'a']++;
        }

        // Second pass: Find the first character with frequency 1
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (countChar[ch - 'a'] == 1) {
                return ch; // Return as soon as we find a non-repeating character
            }
        }

        return ' '; // Return a space if no non-repeating character found
    }
