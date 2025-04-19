// File: QuickSort.java
// Description: Java program to implement Quick Sort on an integer array
public class QuickSort {

    // Function to print the array
    public static void printArray(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    // Main quick sort function using divide-and-conquer
    public static void quickSort(int numbers[], int si, int ei) {
        if (si >= ei) {
            return; // Base case: single or no element
        }

        // Partition the array and get pivot index
        int pivotIndex = partition(numbers, si, ei);

        // Recursively sort the left part
        quickSort(numbers, si, pivotIndex - 1);

        // Recursively sort the right part
        quickSort(numbers, pivotIndex + 1, ei);
    }

    // Partition function to place the pivot element at the correct position
    public static int partition(int numbers[], int si, int ei) {
        int pivot = numbers[ei]; // Choosing the last element as pivot
        int i = si - 1; // Index for placing smaller elements

        for (int j = si; j < ei; j++) {
            if (numbers[j] <= pivot) {
                i++;
                // Swap numbers[i] and numbers[j]
                int temp = numbers[j];
                numbers[j] = numbers[i];
                numbers[i] = temp;
            }
        }

        // Place the pivot in its correct sorted position
        i++;
        int temp = pivot;
        numbers[ei] = numbers[i];
        numbers[i] = temp;

        return i; // Return the pivot index
    }

    // Main method to test Quick Sort
    public static void main(String[] args) {
        int numbers[] = {6, 3, 9, 8, 2, 5};

        // Apply quick sort on the array
        quickSort(numbers, 0, numbers.length - 1);

        // Print the sorted array
        System.out.print("Sorted Array: ");
        printArray(numbers);
    }
}
