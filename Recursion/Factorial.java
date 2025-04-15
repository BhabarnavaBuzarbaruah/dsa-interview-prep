// Factorial.java
// Recursive function to find the factorial of a number

public class Factorial {
    // Method to calculate factorial
    public static int factorial(int num) {
        // Base case: factorial of 0 is 1
        if (num == 0) {
            return 1;
        }
        // Recursive call: num * factorial of (num - 1)
        int fact = num * factorial(num - 1);
        return fact;
    }

    public static void main(String args[]) {
        int n = 5;
        System.out.println("Factorial of " + n + " is: " + factorial(n));
    }
}
