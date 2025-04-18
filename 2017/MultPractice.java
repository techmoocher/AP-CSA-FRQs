/*
*    Created by: {techmoocher}
*    Date: Arpil 18, 2025
*/

/* Question 2 */

/* Implementation for StudyPractice interface is not shown */
public class MultPractice implements StudyPractice {
    private int firstInt, secondInt;
    
    public MultPractice(int first, int second) {
        firstInt = first;
        secondInt = second;
    }
    
    public String getProblem() {
        return firstInt + " TIMES " + secondInt;
    }
    
    public void nextProblem() {
        secondInt++;
    }
}
