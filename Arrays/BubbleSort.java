// Problem: Sort an array using Bubble Sort Algorithm
// Bubble Sort compares each pair of adjacent elements and swaps them if they are in the wrong order.
public static void bubbleSort(int[] arr) {
        int n = arr.length;

        // Outer loop to go through all array elements
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false; // To optimize and stop if array is already sorted

            // Inner loop to compare adjacent elements
            for (int j = 0; j < n - 1 - i; j++) {
                // Swap if current element is greater than next
                if (arr[j] > arr[j + 1]) {
                    // Swapping using a temporary variable
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped in the inner loop, the array is sorted
            if (!swapped) {
                break;
            }
        }
    }

