/*
*    Created by: {techmoocher}
*    Date: Arpil 17, 2025
*/

/* Question 2 */

/* Implementation for WordPair class is not shown */

public class WordPairList {
    private ArrayList<WordPair> allPairs;
    
    public WordPairList(String[] words) {
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                allPairs.add(new WordPair(words[i], words[j]));
            }
        }
    }
    
    public int numMatches() {
        int count = 0;
        for (WordPair item : allPairs) {
            if (item.getFirst().equals(item.getSecond())) {
                count++;
            }
        }
        return count;
    }
}
