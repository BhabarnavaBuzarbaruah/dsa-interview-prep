// Print all subarrays, their sums, and find the maximum subarray sum (Brute Force)

public class Print_Subarray {
    public static void printSubarray(int arr[]) {
        int totalSubarrays = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int subArraySum = 0;

            for (int j = i; j < arr.length; j++) {
                // Print subarray
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }

                // Update sum and max
                subArraySum += arr[j];
                max = Math.max(max, subArraySum);

                System.out.println(); // New line after each subarray
                totalSubarrays++;
            }
        }

        System.out.println("\nTotal Subarrays: " + totalSubarrays);
        System.out.println("Maximum Subarray Sum (Brute Force): " + max);
    }

    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3};
        printSubarray(arr);
    }
}
