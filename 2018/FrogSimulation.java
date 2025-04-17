/*
*    Created by: {techmoocher}
*    Date: Arpil 17, 2025
*/

/* Question 1 */

public class FrogSimulation {
    private int goalDistance;
    private int maxHops;
    
    public FrogSimulation(int dist, int numHops) {
        goalDistance = dist;
        maxHops = numHops;
    }
    
    private int hopDistance() {
        /* implementation not shown */
    }
    
    public boolean simulate() {
        int displacement = 0;
        for (int i = 0; i < numHops; i++) {
            displacement += hopDistance();
            if (displacement >= goalDistance) {
                return true;
            }
            else if (displacement <= 0) {
                return false;
            }
        }
        return false;
    }
    
    public double runSimulation(int num) {
        int count = 0;
        for (int i = 0; i < num; i++) {
            boolean isGoalReached = simulate();
            if (isGoalReached) {
                count++;
            }
        }
        return (double) count / num;
    }
}
