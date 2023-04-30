import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID75{
	/**
	* Get the number of days for the given month in the given year.
	*/
	public static int getDaysInMonth(int year, int month){
			int days;
	switch(month){
		case 1: // January
		case 3: // March
		case 5: // May
		case 7: // July
		case 8: // August
		case 10: // October
		case 12: // December
			days = 31;
			break;
		case 4: // April
		case 6: // June
		case 9: // September
		case 11: // November
			days = 30;
			break;
		case 2: // February
			if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
				days = 29;
			} else {
				days = 28;
			}
			break;
		default:
			days = 0;
			break;
	}
	return days;
}

/**
 * Get the number of days between two given dates.
 */
public static int getDaysBetweenDates(int year1, int month1, int day1, int year2, int month2, int day2){

	int daysBetweenDates = 0;

	// Adjust dates for same year
}
}