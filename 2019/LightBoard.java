/*
*    Created by: {techmoocher}
*    Date: Arpil 16, 2025
*/

/* Question 4 */

public class LightBoard {
    private boolean[][] lights;
    
    public LightBoard(int numRows, int numCols) {
        lights = new boolean[numRows][numCols];
        
        for (int i = 0; i < lights.length; i++) {
            for (int j = 0; j < lights[0].length; j++) {
                int chance = (int) (Math.random() * (100)) + 1;
                if (chance <= 40) {
                    lights[i][j] = true;
                }
                else {
                    lights[i][j] = false;
                }
            }
        }
    }
    
    public boolean evaluateLight(int row, int col) {
        int count = 0;
        for (int r = 0; r < lights.length; r++) {
            if (lights[r][col]) {
                count++;
            }
        }
        
        if (lights[row][col] == true) {
            if (count % 2 == 0) {
                return false;
            }
        }
        else if (lights[row][col] == false) {
            if (count % 3 == 0) {
                return true;
            }
        }
        return lights[row][col];
    }
}
