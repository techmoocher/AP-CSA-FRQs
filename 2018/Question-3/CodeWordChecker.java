/*
*    Created by: {techmoocher}
*    Date: Arpil 17, 2025
*/

/* Question 3 */

/* Implementation for StringChecker interface is not shown */
/* isValid is a method of StringChecker interface */
public class CodeWordChecker implements StringChecker {
    private int minLength, maxLength;
    private String special;
    
    public CodeWordChecker(int minimum, int maximum, String str) {
        minLength = minimum;
        maxLength = maximum;
        special = str;
    }
    
    public CodeWordChecker(String str) {
        minLength = 6;
        maxLength = 20;
        special = str;
    }
    
    public boolean isValid(String item) {
        if (item.length() >= minLength && item.length() <= maxLength && item.indexOf(special) == -1) {
            return true;
        }
        return false;
    }
}
