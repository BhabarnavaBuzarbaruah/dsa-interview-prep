// Problem: Find the maximum product of any two positive numbers in an array
// Approach: Track the two largest numbers and return their product
public class MaxMultiplicationPositive {

    // Function to calculate max product of two numbers
    public static int maxProduct(int[] nums) {
        // Initialize first and second max values to 0 (for positive numbers)
        int max1 = 0;
        int max2 = 0;

        // Traverse the array to find top two maximum numbers
        for (int i = 0; i < nums.length; i++) {
            // If current number is greater than max1, update both max1 and max2
            if (nums[i] > max1) {
                max2 = max1;
                max1 = nums[i];
            }
            // Else if it’s greater than max2, just update max2
            else if (nums[i] > max2) {
                max2 = nums[i];
            }
        }

        // Return the product of the two largest positive numbers
        return max1 * max2;
    }
