// Problem: Sort an array using Insertion Sort
// Insertion Sort builds the final sorted array one element at a time
public static void insertionSort(int[] arr) {
        // Start from the second element since the first one is "sorted"
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];     // Element to be inserted
            int j = i - 1;

            // Move elements of arr[0...i-1], that are greater than current,
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];  // Shift element to the right
                j--;
            }

            // Insert the current element into the correct position
            arr[j + 1] = current;
        }
    }
