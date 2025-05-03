/*
*    Created by: {techmoocher}
*    Date: Arpil 18, 2025
*/

/* Question 1 */

public class Digits {
    private ArrayList<Integer> digitList;
    
    public Digits(int num) {
        digitList = new ArrayList<Integer>();
        if (num == 0) {
            digitList.add(0);
        }
        while (num > 0) {
            digitList.add(0, new Integer(num % 10));
            num /= 10;
        }
    }
    
    public boolean isStrictlyIncreasing() {
        for (int i = 0; i < digitList.size() - 1; i++) {
            if (digitList.get(i + 1) <= digitList.get(i)) {
                return false;
            }
        }
        return true;
    }
}
