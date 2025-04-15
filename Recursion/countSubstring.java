// CountSubstrings.java
// Count total number of substrings in a string where the first and last characters are the same
/ Recursive function to count substrings with same starting and ending characters
    public static int countSubstring(String str, int start, int end) {
        // Base Case: If start exceeds end of the string
        if (start > end) {
            return 0;
        }

        int count = 0;

        // Check for substrings starting at index 'start'
        for (int i = start; i < str.length(); i++) {
            if (str.charAt(start) == str.charAt(i)) {
                count++; // Substring from 'start' to 'i' is valid
            }
        }

        // Recurse for the next starting index
        return count + countSubstring(str, start + 1, end);
    }
