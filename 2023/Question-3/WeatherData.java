/*
*    Created by: {techmoocher}
*    Date: Arpil 12, 2025
*/

/* Question 3 */

public class WeatherData {
    private ArrayList<Double> temperatures;
    
    public void cleanData(double lower, double upper) {
        for (int i = temperatures.size() - 1; i >= 0; i--) {
            if (temperatures.get(i) < lower || temperatures.get(i) > upper) {
                temperatures.remove(i);
            }
        }
    }
    
    public int longestHeatWave(double threshold) {
        int maximum = 0;
        int current = 0;
        for (double value : temperatures) {
            current = (value > threshold) ? current + 1 : 0;
            if (current >= 2 && current > maximum) {
                maximum = current;
            }
        }
        return maximum;
    }
}
