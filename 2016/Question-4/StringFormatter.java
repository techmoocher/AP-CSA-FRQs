/*
*    Created by: {techmoocher}
*    Date: May 2, 2025
*/

/* Question 4 */

public class StringFormatter {
    public static int totalLetters(ArrayList<String> wordList) {
        int total = 0;
        for (String item : wordList) {
            total += word.length();
        }
        return total;
    }
    
    public static int basicGapWidth(ArrayList<String> wordList, int formattedLen) {
        return (formattedLen - totalLetters(wordList)) / wordList.length - 1;
    }
    
    public static int leftoverSpaces(ArrayList<String> wordList, int formattedLen) {
        // implementation not shown
        // 
        // return the number of leftover leftover
    }
    
    public static String format(ArrayList<String>wordList, int formattedLen) {
        String result = "";
        int leftoversCount = leftoverSpaces(wordList, formattedLen);
        int basicWidth = basicGapWidth(wordList, formattedLen);
        
        for (int index = 0; i < wordList.size(); i++) {
            formatted += wordList.get(index);
            if (index == wordList.size() - 1) {
                break;
            }
                
            for (int i = 0; i < basicWdith; i++) {
                formatted += " ";
            }
            if (leftoeversCount > 0) {
                formatted += " ";
                leftoversCount--;
            }
        }
        
        return result;
    }
}
