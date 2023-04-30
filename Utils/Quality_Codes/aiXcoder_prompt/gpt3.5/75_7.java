import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID75{
	/**
	* Get the number of days for the given month in the given year.
	*/
	public static int getDaysInMonth(int year, int month){
			int daysInMonth = 0;
	if (month == 2) {
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
			daysInMonth = 29;
		else
			daysInMonth = 28;
	}
	else if (month == 4 || month == 6 || month == 9 || month == 11)
		daysInMonth = 30;
	else
		daysInMonth = 31;
	
	return daysInMonth;
}

/**
* Get the number of days between two given dates.
*/
public static int getDaysBetweenDates(int day1, int month1, int year1, int day2, int month2, int year2) {
	int daysBetween = 0;
	int daysInMonth = 0;
	
	if (year1 == year2 && month1 == month2) {
		daysBetween = day2 - day1;
	}
	else {
		// Count the number of days remaining in the first month
		daysInMonth = getDaysInMonth(year1, month1);
		daysBetween = daysInMonth - day1;
		
		// Count the number of days in the remaining months of the first year
		for (int i = month1 + 1; i <= 12; i++) {
			daysInMonth = getDaysInMonth(year1, i);
			daysBetween += daysInMonth;
		}
		
		// Count the number of days in each full year
		for (int i = year1 + 1; i < year2; i++) {
			if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0)
				daysBetween += 366;
			else
				daysBetween += 365;
		}
		
		// Count the number of days in the months of the final year
		for (int i = 1; i < month2; i++) {
			daysInMonth = getDaysInMonth(year2, i);
			daysBetween += daysInMonth;
		}
		
		// Count the number of days in the final month
		daysBetween += day2;
	}
	
	return daysBetween;
}

public static void main(String[] args) {
	int day1 = 1;
}
}