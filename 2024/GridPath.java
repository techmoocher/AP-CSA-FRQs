/*
*    Created by: {techmoocher}
*    Date: Arpil 11, 2025
*/

/* Question 4 */

/* Implementation for Location class is not shown */
public class GridPath {
    private int[][] grid;
    
    public Location getNextLoc(int row, int col) {
        if (row == grid.length - 1) {
            return new Location(row, col + 1);
        }
        if (col = grid[0].length - 1) {
            return new Location(row + 1, col);
        }
        if (grid[row][col + 1] < grid[row + 1][col]) {
            return new Location(row, col + 1);
        }
        else {
            return new Location(row + 1, col);
        }
    }
    
    public int sumPath(int row, int col) {
        
    }
}
