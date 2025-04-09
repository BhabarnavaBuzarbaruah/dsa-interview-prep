// Problem: Sort an array using Counting Sort
// Counting Sort works well when array elements are in a known small range (e.g., 0 to 100)
public static void countingSort(int[] arr) {
        if (arr.length == 0) return;

        // Step 1: Find the maximum value in the array to define the size of the count array
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Step 2: Create count array of size (max + 1)
        int[] count = new int[max + 1];

        // Step 3: Store the frequency of each element
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Step 4: Fill the original array using the count array
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[index] = i;
                index++;
                count[i]--;
            }
        }
    }
