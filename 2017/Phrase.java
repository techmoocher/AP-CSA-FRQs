/*
*    Created by: {techmoocher}
*    Date: Arpil 18, 2025
*/

/* Question 3 */

public class Phrase {
    private String currentPhrase;
    
    public Phrase(String p) {
        currentPhrase = p;
    }
    
    public int findNthOccurrence(String str, int n) {
        /* implementation not shown */
    }
    
    public String toString() {
        return currentPhrase;
    }
    
    public void replaceNthOccurrence(String str, int n, String repl) {
        int index = findNthOccurrence(str, n);
        if (index != -1) {
            currentPhrase = currentPhrase.substring(0, index) + repl + currentPhrase(index + str.length());
        }
    }
    
    public int findLastOccurrence(String str) {
        for (int i = currentPhrase.length() - str.length() - 2; i >= 0; i--) {
            if (currentPhrase.substring(i, i + str.length()).equals(str)) {
                return i;
            }
        }
        return -1;
    }
}
