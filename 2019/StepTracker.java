/*
*    Created by: {techmoocher}
*    Date: Arpil 16, 2025
*/

/* Question 2 */

public class StepTracker {
    private int threshold;
    private int activeCount, totalSteps, totalDays;
    
    public StepTracker(int steps) {
        threshold = stepsCount;
        activeCount = 0;
        totalSteps = 0;
        totalDays = 0;
    }
    
    public int activeDays() {
        return activeCount;
    }
    
    public void addDailySteps(int stepsCount) {
        totalSteps += stepsCount;
        totalDays++;
        if (stepsCount >= threshold) {
            activeCount++;
        }
    }
    
    public double averageSteps() {
        if (totalDays == 0) {
            return 0.0;
        }
        return (double) totalSteps / totalDays;
    }
}
