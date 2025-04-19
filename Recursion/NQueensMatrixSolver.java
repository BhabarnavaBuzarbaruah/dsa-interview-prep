// File: NQueensMatrixSolver.java
// Description: Java program to solve N-Queens problem using backtracking
public class NQueens_inserted_in_a_matrix {

    static int count = 0; // Track total number of ways to solve N-Queens

    /**
     * Checks if a queen can be placed safely at (row, col)
     */
    public static boolean isSafe(char chessBoard[][], int row, int col) {
        // Check vertical upward
        for (int i = row - 1; i >= 0; i--) {
            if (chessBoard[i][col] == 'Q') {
                return false;
            }
        }

        // Check left diagonal upward
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (chessBoard[i][j] == 'Q') {
                return false;
            }
        }

        // Check right diagonal upward
        for (int i = row - 1, j = col + 1; i >= 0 && j < chessBoard.length; i--, j++) {
            if (chessBoard[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    /**
     * Recursively places queens in the chessboard and prints all solutions
     */
    public static void NQueens(char chessBoard[][], int row) {
        if (row == chessBoard.length) {
            printChessBoard(chessBoard);
            count++;
            return;
        }

        // Try placing queen in each column in the current row
        for (int j = 0; j < chessBoard.length; j++) {
            if (isSafe(chessBoard, row, j)) {
                chessBoard[row][j] = 'Q'; // Place queen
                NQueens(chessBoard, row + 1); // Recursive call
                chessBoard[row][j] = 'x'; // Backtrack
            }
        }
    }

    /**
     * Finds at least one possible solution (used for checking if a solution exists)
     */
    public static boolean NQueensPossible(char chessBoard[][], int row) {
        if (row == chessBoard.length) {
            return true;
        }

        for (int j = 0; j < chessBoard.length; j++) {
            if (isSafe(chessBoard, row, j)) {
                chessBoard[row][j] = 'Q';
                if (NQueensPossible(chessBoard, row + 1)) {
                    return true;
                }
                chessBoard[row][j] = 'x'; // Backtrack
            }
        }

        return false;
    }

    /**
     * Prints the current state of the chessboard
     */
    public static void printChessBoard(char chessBoard[][]) {
        System.out.println("______ChessBoard_________");
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard.length; j++) {
                System.out.print(chessBoard[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int n = 4;
        char chessBoard[][] = new char[n][n];

        // Initialize chessboard with 'x' (empty)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                chessBoard[i][j] = 'x';
            }
        }

        // Uncomment to print all solutions:
        // NQueens(chessBoard, 0);
        // System.out.println("Total ways to solve N-Queens: " + count);

        // Check if at least one solution exists
        if (NQueensPossible(chessBoard, 0)) {
            System.out.println("Solution is possible");
            printChessBoard(chessBoard);
        } else {
            System.out.println("Solution is not possible");
        }
    }
}
