public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] merged = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        // Compare elements from both arrays and merge them in sorted order
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        // Copy remaining elements from arr1, if any
        while (i < n1) {
            merged[k++] = arr1[i++];
        }

        // Copy remaining elements from arr2, if any
        while (j < n2) {
            merged[k++] = arr2[j++];
        }

        return merged;
    }
