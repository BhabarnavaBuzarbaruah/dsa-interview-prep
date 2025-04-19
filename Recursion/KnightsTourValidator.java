// File: KnightsTourValidator.java
// Description: Java program to validate if a given grid represents a valid Knight's Tour
public class Knights_Tour {

    /**
     * Validates whether the given grid is a valid Knight's Tour.
     *
     * @param grid     The NxN chessboard grid with moves from 0 to N^2-1
     * @param r        Current row
     * @param c        Current column
     * @param n        Size of the grid (NxN)
     * @param expValue The expected value in the Knight's tour sequence
     * @return true if the tour is valid, false otherwise
     */
    public static boolean isValid(int grid[][], int r, int c, int n, int expValue) {
        // Base cases for invalid move
        if (r < 0 || c < 0 || r >= n || c >= n || grid[r][c] != expValue) {
            return false;
        }

        // If all squares are visited in correct sequence
        if (expValue == (n * n) - 1) {
            return true;
        }

        // Try all 8 knight moves
        boolean ans1 = isValid(grid, r - 2, c + 1, n, expValue + 1);
        boolean ans2 = isValid(grid, r - 1, c + 2, n, expValue + 1);
        boolean ans3 = isValid(grid, r + 1, c + 2, n, expValue + 1);
        boolean ans4 = isValid(grid, r + 2, c + 1, n, expValue + 1);
        boolean ans5 = isValid(grid, r + 2, c - 1, n, expValue + 1);
        boolean ans6 = isValid(grid, r + 1, c - 2, n, expValue + 1);
        boolean ans7 = isValid(grid, r - 1, c - 2, n, expValue + 1);
        boolean ans8 = isValid(grid, r - 2, c - 1, n, expValue + 1);

        // If any path leads to a valid tour, return true
        return ans1 || ans2 || ans3 || ans4 || ans5 || ans6 || ans7 || ans8;
    }

    // Main method to test the Knight's Tour validation
    public static void main(String args[]) {
        // Example 3x3 Knight's Tour grid
        int grid[][] = {
            {0, 3, 6},
            {5, 8, 1},
            {2, 7, 4}
        };

        System.out.println("Is the given grid a valid Knight's Tour?");
        System.out.println(isValid(grid, 0, 0, grid.length, 0));
    }
}
