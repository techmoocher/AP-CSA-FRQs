/*
*    Created by: {techmoocher}
*    Date: Arpil 11, 2025
*/

/* Question 3 */

public class WordChecker {
    private ArrayList<String> wordList;
    
    public boolean isWordChain() {
        for (int i = 1; i < wordList.size(); i++) {
            String current = wordList.get(i);
            String previous = wordList.get(i - 1);
            if (current.indexOf(previous) == -1) {
                return false;
            }
        }
        return true;
    }
    
    public ArrayList<String> createList(String target) {
        ArrayList<String> results = new ArrayList<String>();
        
        for (String item : wordList) {
            if (item.indexOf(target) == 0) {
                results.add(item.substring(target.length()));
            }
        }
    }
}
