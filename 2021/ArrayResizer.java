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
            if (array2D[r][col] == 0) {
                return false;
            }
        }
        return true;
    }

    public static int[][] resize(int[][] array2D) {
        int count = numNonZeroRows(array2D);
        int[][] resizedArray = new int[count][array2D[0].length];
        
        int currentRow = 0;
        for (int row = 0; row < array2D.length; row++) {
            if (isNonZeroRow(array2D, row)) {
                for (int col = 0; col < array2D[0].length; col++) {
                    resizedArray[currentRow][col] = array2D[row][col];
                }
                currentRow++;
            }
        }
        return resizedArray;
    }
}
