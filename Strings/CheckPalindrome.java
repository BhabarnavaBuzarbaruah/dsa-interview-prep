// Problem: Check if a given string is a palindrome
// A string is a palindrome if it reads the same backward as forward
// Function to check if the string is a palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        // Compare characters from both ends
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }

        return true; // All characters matched
    }
