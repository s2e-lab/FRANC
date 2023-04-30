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
	switch(month){
		case 1: // January
		case 3: // March
		case 5: // May
		case 7: // July
		case 8: // August
		case 10: // October
		case 12: // December
			daysInMonth = 31;
			break;
		case 4: // April
		case 6: // June
		case 9: // September
		case 11: // November
			daysInMonth = 30;
			break;
		case 2: // February
			boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
			if(isLeapYear){
				daysInMonth = 29;
			}
			else{
				daysInMonth = 28;
			}
			break;
	}
	return daysInMonth;
	}

	/**
	* Get the number of days between two dates.
	*/
	public static int getDaysBetweenDates(int day1, int month1, int year1,
										  int day2, int month2, int year2){
	int daysBetweenDates = 0;

	// If the years are different, keep adding the number of days in each year until we get to the year2
	while(year1 < year2){
		int daysInYear = 0;
		for(int i = month1; i <= 12; i++){
			daysInYear += getDaysInMonth(year1, i);
		}
		daysBetweenDates += daysInYear - (day1-1);
		day1 = 1;
		month1 = 1;
		year1++;
	}

	// Add the number of days in the same year, but between the two given dates
	while(month1 < month2){
		daysBetweenDates += getDaysInMonth(year1, month1) - (day1-1);
		day1 = 1;
		month1++;
	}

	daysBetweenDates += day2-day1;

	return daysBetweenDates;
	}

	/**
	* Main method
	*/
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first date in dd/mm/yyyy format:");
	String date1 = sc.nextLine();
}
}