/*
*    Created by: {techmoocher}
*    Date: Arpil 15, 2025
*/

/* Question 4 */

public class ArrayResizer {
    public static int numNonZeroRows(int[][] array2D) {
        /* implementation not shown */
    }
    
    public static boolean isNonZeroRow(int[][] array2D, int r) {
        for (int col = 0; col < array2D[0].length; col++) {
            if (int[r][col] == 0) {
                return false;
            }
        }
        return true;
    }

    public static int[][] resize(int[][] array2D) {
        
    }
}
