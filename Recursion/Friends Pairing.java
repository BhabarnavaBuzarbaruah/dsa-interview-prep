/ Recursive function to calculate total ways friends can pair or stay single
    public static int freindsPairing(int n) {
        // Base Case:
        // If there's only 1 friend => 1 way (stay single)
        // If there are 2 friends => 2 ways (both single or paired together)
        if (n == 1 || n == 2) {
            return n;
        }

        // Choice 1: Friend stays single
        int singleChoice = freindsPairing(n - 1);

        // Choice 2: Friend pairs up with any of the (n-1) others
        int pairedChoice = (n - 1) * freindsPairing(n - 2);

        // Total ways = singleChoice + pairedChoice
        int totalWays = singleChoice + pairedChoice;

        return totalWays;
    }
