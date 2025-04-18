/*
*    Created by: {techmoocher}
*    Date: Arpil 12, 2025
*/

/* Question 4 */

/* Implementation for Candy class is not shown */
public class BoxOfCandy {
    private Candy[][] box;
    
    public boolean moveCandyToFirstRow(int col) {
        if (box[0][col] != null) {
            return true;
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
        for (int i = box.length - 1; i >= 0; i--) {
            for (int j = 0; j < box[0].length; j++) {
                if (box[i][j] != null && box[i][j].getFlavor().equals(flavor)) {
                    Candy removed = box[i][j];
                    box[i][j] = null;
                    return removed;
                }
            }
        }
        return null;
    }
}
