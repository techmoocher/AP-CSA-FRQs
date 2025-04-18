/*
*    Created by: {techmoocher}
*    Date: Arpil 18, 2025
*/

/* Question 4 */

/* Implementation for Positition class is not shown */
public class Successors {
    public static Position findPosition(int num, int[][] intArr) {
        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr[0].length; j++) {
                if (int[i][j] == num) {
                    return new Position(i, j);
                }
            }
        }
        return null;
    }
    
    public static Position[][] getSuccessorArray(int[][] int intArr) {
        Position[][] result = new Position[intArr.length][intArr[0].length];
        for (int row = 0; row < intArr.length; row++) {
            for (int col = 0; col < intArr[0].length; col++) {
                result[row][col] = findPosition(intArr[row][col] + 1, intArr);
            }
        }
        return result;
    }
}
