/*
*    Created by: {techmoocher}
*    Date: May 2, 2025
*/

/* Question 1 */

public class RandomLetterChooser extends RandomStringChooser {
    public RandomLetterChooser(String str) {
        super(getSingleLetters(str));
    }
    
    public static String[] getSingleLetters(String str) {
        /* implementation not shown */
    }
}
