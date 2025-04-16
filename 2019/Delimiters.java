/*
*    Created by: {techmoocher}
*    Date: Arpil 16, 2025
*/

/* Question 3 */

public class Delimiters {
    private String openDel;
    private String closeDel;
    
    public Delimiters(String open, String close) {
        openDel = open;
        closeDel = close;
    }
    
    public ArrayList<String> getDelimitersList(String[] tokens) {
        ArrayList<String> delimitersList = new ArrayList<String>();
        for (String item : tokens) {
            if (item.equals(openDel) || item.equals(closeDel)) {
                delimitersList.add(item);
            }
        }
        return delimitersList;
    }
    
    public boolean isBalanced(ArrayList<String> delimiters) {
        int openCount = 0;
        int closeCount = 0;
        for (String item : delimiters) {
            if (item.equals(openDel)) {
                openCount++;
            }
            else if (item.equals(closeDel)) {
                closeDel++;
            }
            if (openCount < closeCount) {
                return false;
            }
        }
        if (openCount == closeCount) {
            return true;
        }
        return false;
    }
}
