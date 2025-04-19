// File: GridWays.java
// Description: Java program to count the number of unique paths in a grid from (0,0) to (n-1,m-1) using recursion
public class Grid_Ways {

    /**
     * Recursive function to count total ways to reach the destination cell (n-1, m-1)
     * from the starting cell (i, j) in an n x m grid.
     * 
     * Time Complexity: O(2^(n+m))
     * Space Complexity: O(n + m) - due to recursion stack
     * 
     * @param i Current row index
     * @param j Current column index
     * @param n Total number of rows
     * @param m Total number of columns
     * @return Number of unique paths from (i,j) to (n-1,m-1)
     */
    public static int gridWays(int i, int j, int n, int m) {
        // Base case: reached destination cell
        if (i == n - 1 && j == m - 1) {
            return 1;
        }

        // Boundary condition: out of bounds
        if (i == n || j == m) {
            return 0;
        }

        // Recursive calls: move down and move right
        int ways1 = gridWays(i + 1, j, n, m); // Down move
        int ways2 = gridWays(i, j + 1, n, m); // Right move

        // Total ways from current cell
        return ways1 + ways2;
    }

    // Main method to run the program
    public static void main(String args[]) {
        int n = 3, m = 3; // Grid size
        int totalWays = gridWays(0, 0, n, m);

        System.out.println("Total number of ways to reach destination ("
            + (n - 1) + "," + (m - 1) + "): " + totalWays);
    }
}
