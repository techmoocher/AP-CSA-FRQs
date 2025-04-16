/*
*    Created by: {techmoocher}
*    Date: Arpil 16, 2025
*/

/* Question 1 */

public class APCalendar {
	private static boolean isLeapYear(int year) {
		/* implementation not shown */
	}
	public static int firstDayOfYear(int year) {
		/* implementation not shown */
	}
	private static int dayOfYear(int month, int day, int year) {
		/* implementation not shown */
	}

	public static int numberOfLeapYears(int year1, int year2) {
        int count = 0;
        for (int year = year1; year <= year2; year++) {
        	if (isLeapYear(year)) {
                count++;
            }
        }
        return count;
    }
}
