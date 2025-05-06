/*
*    Created by: {techmoocher}
*    Date: Arpil 14, 2025
*/

/* Question 1 */

public class WordMatch {
    private String secret;
    
    public WordMatch(String word) {
        /* implementation not shown */
    }
    
    public int scoreGuess(String guess) {
        int count = 0;
        int index = 0;
        while (index <= secret.length() - guess.length()) {
            int found = secret.indexOf(guess, index);
            if (found == -1) {
                break;
            }
            count++;
            index = found + 1;
        }
        return count * guess.length() * guess.length();
    }
    
    public String findBetterGuess(String guess1, String guess2) {
        if (scoreGuess(guess1) > scoreGuess(guess2)) {
            return guess1;
        }
        if (scoreGuess(guess1) < scoreGuess(guess2)) {
            return guess2;
        }
        if (guess1.compareTo(guess2) > 0) {
            return guess1;
        }
        return guess2;
    }
}
