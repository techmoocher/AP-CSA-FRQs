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
        
    }
}
