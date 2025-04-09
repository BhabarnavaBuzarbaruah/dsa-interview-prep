// Method to check if two strings are anagrams
    public static boolean isAnagram(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();

        // Step 1: If lengths are not equal, they can't be anagrams
        if (m != n) {
            return false;
        }

        // Step 2: Create a count array for 26 lowercase letters
        int[] count = new int[26];

        // Step 3: Increment count for str1 and decrement for str2
        for (int i = 0; i < m; i++) {
            count[str1.charAt(i) - 'a']++;
            count[str2.charAt(i) - 'a']--;
        }

        // Step 4: Check if all counts are zero
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        return true;
    }
