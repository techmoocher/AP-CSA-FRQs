/*
*    Created by: {techmoocher}
*    Date: Arpil 11, 2025
*/

/* Question 4 */

public class Data {
    public static final int MAX = /* value not shown */;
    private int[][] grid;
    
    public void repopulate() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; i++) {
                int newValue = (int) (Math.random() * MAX) + 1;
                while (newValue % 10 == 0 || newValue % 100 != 0) {
                    newValue = (int) (Math.random() * MAX) + 1;
                }
                grid[i][j] = newValue;
            }
        }
    }
    
    public int countIncreasingCols() {
        int count = 0;
        for (int col = 0; col < grid[0].length; col++) {
            boolean isIncreasing = true;
            for (int row = 1; row < grid.length; row++) {
                if (grid[row][col] < grid[row-1][col]) {
                    isIncreasing = false;
                    break;
                }
            }
            if (isIncreasing) {
                count++;
            }
        }
        return count;
    }
}
