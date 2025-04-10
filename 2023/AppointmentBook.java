/*
*    Created by: {techmoocher}
*    Date: Arpil 9, 2025
*/

/* Question 1 */

public class AppointmentBook {
    
    private boolean isMinuteFree(int period, int minute) {
        /*
         *  Returns true if minute in period is avialable for an appointment
         *  and returns false otherwise
		 *
         *  Preconditions: 1 <= period <= 8; 0 <= minute <= 59;
         */
    }
    private void reserveBlock(int period, int startMinute, int duration) {
        /*
         *  Marks the block of minutes that starts at startMinute in period
         *  and duration minutes long as reserved for an appointment
		 *
         *	Preconditions: 1 <= period <= 8; 0 <= startMinute <= 59; 1 <= duration <= 60;
         */
    }
    
    public int findFreeBlock(int period, int duration) {
        int count = 0;
        for (int i = 0; i <= 59; i++) {
            if (isMinuteFree(period, i)) {
                count++;
                if (count == duration) {
                    return count - (duration - 1);
                }
            }
            else {
                count = 0;
            }
        }
        return -1;
    }
}
