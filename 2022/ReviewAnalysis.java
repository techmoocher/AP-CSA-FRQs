/*
*    Created by: {techmoocher}
*    Date: Arpil 13, 2025
*/

/* Question 3 */

/* Implementation for Review class is not shown */
public class ReviewAnalysis {
    private Review[] allReviews;
    
    public ReviewAnalysis() {
        // implementation not shown
    }
    
    public double getAverageRating() {
        double result = 0.0;
        for (Review review : allReviews) {
            result += review.getRating();
        }
        return result / allReviews.length;
    }
    
    public ArrayList<String> collectComments() {
        ArrayList<String> results = new ArrayList<String>();
        for (int i = 0; i < allReviews.length; i++) {
            String current = allReviews[i].getComment();
            if (current.indexOf("!") != -1) {
                if (current.charAt(current.length() - 1) != '!' && current.charAt(current.length() - 1) != '.')) {
                    current += ".";
                }
                results.add(i + "-" + current);
            }
        }
        return results;
    }
}
