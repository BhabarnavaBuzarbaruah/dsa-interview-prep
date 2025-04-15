// BinaryStringsProblem.java
// Print all binary strings of length 'n' with no consecutive 1s
// Recursive method to generate binary strings
    // n - remaining length to fill
    // lastPlace - 0 if last added character was '0', 1 if it was '1'
    // str - current built string
    public static void binaryString(int n, int lastPlace, String str) {
        // Base case: if length reaches 0, print the string
        if (n == 0) {
            System.out.println(str);
            return;
        }

        // Always add '0' at current position
        binaryString(n - 1, 0, str + "0");

        // Add '1' only if the last character was not '1'
        if (lastPlace == 0) {
            binaryString(n - 1, 1, str + "1");
        }
    }
