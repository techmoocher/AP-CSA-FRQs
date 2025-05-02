/*
*    Created by: {techmoocher}
*    Date: May 2, 2025
*/

/* Question 1 */

public class RandomStringChooser {
    private ArrayList<String> data;
    
    public RandomStringChooser(String[] input) {
        data = new ArrayList<String>();
        for (String item : input) {
            data.add(item);
        }
    }
    
    public String getNext() {
        if (data.size() == 0) {
            return "NONE";
        }
        int index = (int) (Math.random() * data.size());
        String result = data.get(index);
        data.remove(index);
        return result;
    }
}
