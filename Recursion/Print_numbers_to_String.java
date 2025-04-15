// Print_numbers_to_String.java
// Problem: Convert an integer to its string representation using words
public class Print_numbers_to_String {

    // Array to map digits to their corresponding word
    static String numsToWords[] = {
        "zero", "one", "two", "three", "four", 
        "five", "six", "seven", "eight", "nine"
    };

    // Recursive function to convert number to words
    public static String convertNumberToString(int num) {
        // Base case: if number is 0, return empty string
        if (num == 0) {
            return "";
        }

        int lastDigit = num % 10;           // Get the last digit
        int remainingNum = num / 10;        // Remove the last digit

        // If the remaining number is 0, return only the last digit word
        if (remainingNum == 0) {
            return numsToWords[lastDigit];
        }

        // Recursive call and combine the result with current digit's word
        return convertNumberToString(remainingNum) + " " + numsToWords[lastDigit];
    }

    public static void main(String args[]) {
        int number = 2019;
        System.out.println("Number in words: " + convertNumberToString(number));
    }
}
