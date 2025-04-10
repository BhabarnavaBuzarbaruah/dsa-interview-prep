// This program compresses a string by replacing consecutive duplicate characters
// with a single character followed by the count of repetitions.

public class CompressedString {

    // Method to compress the input string
    public static String compressdString(String str) {
        StringBuilder sb = new StringBuilder(); // To build the compressed string

        for (int i = 0; i < str.length(); i++) {
            int count = 1;

            // Count how many times the current character repeats consecutively
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            // Append the character
            sb.append(str.charAt(i));

            // If it appeared more than once, append the count
            if (count > 1) {
                sb.append(count);
            }
        }

        return sb.toString();
    }
