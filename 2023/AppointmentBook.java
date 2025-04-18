/*
*    Created by: {techmoocher}
*    Date: Arpil 12, 2025
*/

/* Question 1 */

public class AppointmentBook {
    
    private boolean isMinuteFree(int period, int minute) {
        /* implementation not shown */
        
        /*
         *  Returns true if minute in period is avialable for an appointment
         *  and returns false otherwise
         *
         *  Preconditions: 1 <= period <= 8; 0 <= minute <= 59;
         */
    }
    private void reserveBlock(int period, int startMinute, int duration) {
        /* implementation not shown */
        
        /*
         *  Marks the block of minutes that starts at startMinute in period
         *  and duration minutes long as reserved for an appointment
         *
         *  Preconditions: 1 <= period <= 8; 0 <= startMinute <= 59; 1 <= duration <= 60;
         */
    }
    
    public int findFreeBlock(int period, int duration) {
        int count = 0;
        for (int i = 0; i <= 59; i++) {
            if (isMinuteFree(period, i)) {
                count++;
                if (count == duration) {
                    return i - (duration - 1);
                }
            }
            else {
                count = 0;
            }
        }
        return -1;
    }
    
    public boolean makeAppointment(int startPeriod, int endPeriod, int duration) {
        for (int i = startPeriod; i <= endPeriod; i++) {
            int minute = findFreeBlock(i, duration);
            if (minute != -1) {
                reserveBlock(i, minute, duration);
                return true;
            }
        }
        return false;
    }
}
