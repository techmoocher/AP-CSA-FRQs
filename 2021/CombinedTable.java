/*
*    Created by: {techmoocher}
*    Date: Arpil 14, 2025
*/

/* Question 2 */

/* Implementation for SingleTable class is not shown */
public class CombinedTable {
    private SingleTable table1;
    private SingleTable table2;
    
    public CombinedTable(SingleTable t1, SingleTable t2) {
        table1 = t1;
        table2 = t2;
    }
    
    public boolean canSeat(int num_guests) {
        if (table1.getNumSeats() + table2.getNumSeats() - 2 >= num_guests) {
            return true;
        }
        return false;
    }
    
    public double getDesirability() {
        double desirability = 0.0;
        if (table1.getHeight() ==  table2.getHeight()) {
            desirability = (table1.getViewQuality() + table2.getViewQuality()) / 2;
        }
        else {
            desirability = (table1.getViewQuality() + table2.getViewQuality()) / 2 - 10;
        }
        return desirability;
    }
}
