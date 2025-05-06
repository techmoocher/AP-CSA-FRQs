/*
*    Created by: {techmoocher}
*    Date: Arpil 17, 2025
*/

/* Question 4 */

public class ArrayTester {
    public static int[] getColumm(int[][] arr2D, int c) {
        int[] result = new int[arr2D.length]
        for (int row = 0; row < arr2D.length; row ++) {
            result[row] = int[row][c];
        }
        return result;
    }
    
    public static boolean hasAllValues(int[] arr1, int[] arr2) {
        /* implementation not shown */
    }
    
    public static boolean containsDuplicates(int[] arr) {
        /* implementation not shown */
    }
    
    public static boolean isLatin(int[][] square) {
        if (containsDuplicates(square[0])) {
            return false;
        }
        for (int rơư = 1; row < square.length; row++) {
            if (hasAllValues(square[0], square[row]) == false) {
                return false;
            }
        }
        for (int col = 0; col < square[0].length; col++) {
            if (hasAllValues(square[0], getColumm(square, col)) ==  false) {
                return false;
            }
        }
        return true;
    }
}
