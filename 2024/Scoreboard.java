/*
*	Created by: {techmoocher}
*	Date: April 1, 2025
*/

/* Question 2 */

public class Scoreboard {
    private String team1, team2;
    private int score1, score2;
    private int activeTeam;
    
    public Scoreboard(String team1Name, String team2Name) {
        team1 = team1Name;
        team2 = team2Name;
        score1 = 0;
        score2 = 0;
        activeTeam = 1;
    }
    
    public void recordPlay(int score) {
        if (score == 0) {
            if (activeTeam == 1) {
                activeTeam = 2;
            }
            else {
                activeTeam = 1;
            }
        }
        else {
            if (activeTeam == 1) {
                score1 += score;
            }
            else {
                score2 += score;
            }
        }
    }
    
    public String getScore() {
        String result = score1 + "-" + score2 + "-";
        if (isActive == 1) {
            return result + team1;
        }
        else {
            return result + team2;
        }
    }
}
