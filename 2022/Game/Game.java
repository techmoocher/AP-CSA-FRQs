/*
*    Created by: {techmoocher}
*    Date: Arpil 11, 2025
*/

/* Question 1 */

/* Implementation for Level class is not shown */
public class Game {
    private Level levelOne;
    private Level levelTwo;
    private Level levelThree;
    
    public Game () {
        // implementation not shown
    }
    public boolean isBonus() {
        // implementation not shown
    }
    public void play() {
        // implementation not shown
    }
    
    public int getScore() {
        int score = 0;
        if (levelOne.goalReached) {
            score += levelOne.getPoints();
            if (levelTwo.goalReached) {
                score += levelTwo.getPoints();
                if (levelThree.goalReached) {
                    score += levelThree.getPoints();
                }
            }
        }
        if (isBonus) {
            score *= 3;
        }
    }
    
    public int playManyTimes(int num) {
        int maximum = 0;
        while (num > 0) {
            play();
            int current = getScore();
            if (current > maximum) {
                maximum = current;
            }
        }
        return maximum;
    }
}
