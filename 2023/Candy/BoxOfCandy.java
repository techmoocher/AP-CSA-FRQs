/*
*    Created by: {techmoocher}
*    Date: Arpil 10, 2025
*/

/* Question 4 */

public class BoxOfCandy {
    private Candy[][] box;
    
    public boolean moveCandyToFirstRow(int col) {
        if (box[0][col] != null) {
            return true
        }
        for (int i = 1; i < box.length; i++) {
            if (box[i][col] != null) {
                box[0][col] = box[i][col];
                box[i][col] = null;
                return true;
            }
        }
        return false;
    }
    
    public Candy removeNextbyFlavor(String flavor) {
        
    }
}
