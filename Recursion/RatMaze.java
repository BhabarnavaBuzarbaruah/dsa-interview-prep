// File: RatMaze.java
// Description: Finds all possible paths for the rat to reach the bottom-right corner of a maze using backtracking
import java.util.ArrayList;

public class RatMaze {

    static ArrayList<String> ans = new ArrayList<>();

    /**
     * Finds all possible paths in the rat maze from (0, 0) to (n-1, n-1).
     * @param ratMaze 2D maze array (1: open path, 0: blocked path).
     * @param row Current row position of the rat.
     * @param col Current column position of the rat.
     * @param ans List to store all valid paths.
     * @param path Current path taken by the rat.
     */
    public static void findPaths(int[][] ratMaze, int row, int col, ArrayList<String> ans, String path) {
        int n = ratMaze.length;

        // Base case: check if the current position is out of bounds or blocked.
        if (row < 0 || col < 0 || row >= n || col >= n || ratMaze[row][col] == 0 || ratMaze[row][col] == -1) {
            return;
        }

        // If the rat reaches the bottom-right corner, add the path to the result.
        if (row == n - 1 && col == n - 1 && ratMaze[row][col] == 1) {
            ans.add(path);
            return;
        }

        // Mark the current cell as visited by setting it to -1.
        ratMaze[row][col] = -1;

        // Recur for all four possible directions (Down, Up, Right, Left)
        findPaths(ratMaze, row + 1, col, ans, path + "D");  // Down
        findPaths(ratMaze, row - 1, col, ans, path + "U");  // Up
        findPaths(ratMaze, row, col + 1, ans, path + "R");  // Right
        findPaths(ratMaze, row, col - 1, ans, path + "L");  // Left

        // Backtrack: Unmark the current cell.
        ratMaze[row][col] = 1;
    }

    public static void main(String[] args) {
        int ratMaze[][] = {
            { 1, 0, 0, 0 },
            { 1, 1, 0, 1 },
            { 1, 1, 0, 0 },
            { 0, 1, 1, 1 }
        };

        // If the starting position is blocked, print that no path is possible.
        if (ratMaze[0][0] == 1) {
            findPaths(ratMaze, 0, 0, ans, "");
            if (ans.isEmpty()) {
                System.out.println("No possible path");
            } else {
                // Print all possible paths.
                for (String path : ans) {
                    System.out.println(path);
                }
            }
        } else {
            System.out.println("No possible path");
        }
    }
}
