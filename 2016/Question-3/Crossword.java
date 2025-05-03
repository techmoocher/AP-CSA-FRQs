/*
*    Created by: {techmoocher}
*    Date: May 2, 2025
*/

/* Question 3 */

/* Implementation for Square class is not shown */

public class Crossword {
    private Square[][] puzzle;
    
    public Crossword(boolean[][] blackSquares) {
        puzzle = new Square[blackSquares.length][blackSquares[0].length];
        int current = 1;
        for (int row = 0; row < puzzle.length; row++) {
            for (int col = 0; col < puzzle[0].length; col++) {
                if (blackSquares[row][col]) {
                    puzzle[row][col] = new Square(true, 0);
                    continue;
                }
                else if (toBeLabeled(row, col, blackSquares) {
                    puzzle[row][col] = new Square(false, current);
                    current++;
                    continue;
                }
                puzzle[row][col] = new Square(false, 0);
            }
        }
    }
    
    private boolean toBeLabeled(int r, int c, boolean[][] blackSquares) {
        if (blackSquares[r][c]) {
            return false;
        }
        if (r == 0 || c == 0) {
            return true;
        }
        if (blackSquares[r - 1][c] || blackSquares[r][c - 1]) {
            return true;
        }
        return false
    }
}
