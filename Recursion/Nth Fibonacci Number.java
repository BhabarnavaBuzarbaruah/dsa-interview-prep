/ Print_Nth_Fibonacci_Number.java
// Recursive function to find the Nth Fibonacci number

public class Print_Nth_Fibonacci_Number {

    // Method to calculate the Nth Fibonacci number
    public static int fibonacci(int num) {
        // Base case: the first and second Fibonacci numbers are 0 and 1
        if (num == 0 || num == 1) {
            return num;
        }

        // Recursive calls: sum of the two previous Fibonacci numbers
        int fibnm1 = fibonacci(num - 1); // (n-1)th Fibonacci number
        int fibnm2 = fibonacci(num - 2); // (n-2)th Fibonacci number
        int fibn = fibnm1 + fibnm2; // nth Fibonacci number

        return fibn;
    }

    public static void main(String args[]) {
        int n = 5; // Change this value to compute other Fibonacci numbers
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));
    }
}
