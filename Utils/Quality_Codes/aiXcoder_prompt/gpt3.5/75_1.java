import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID75{
	/**
	* Get the number of days for the given month in the given year.
	*/
	public static int getDaysInMonth(int year, int month){
			int days = 0;
	switch(month){
		case 2:
			if((year % 4 == 0) && !(year % 100 == 0) || (year % 400 == 0)){
				days = 29;
			}else{
				days = 28;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		default:
			days = 31;
			break;
	}
	return days;
}

/**
* Get the day of the week for the given date.
*/
public static int getDayOfWeek(int year, int month, int day){
	int[] t = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
	if(month < 3){
		year--;
	}
	return (year + year/4 - year/100 + year/400 + t[month-1] + day) % 7;
}

/**
* Get the number of Sundays that fall on the first day of the month during the given range of years.
*/
public static int countFirstSundays(int startYear, int endYear){
	int count = 0;
	for(int year = startYear; year <= endYear; year++){
		for(int month = 1; month <= 12; month++){
			if(getDayOfWeek(year, month, 1) == 0){
				count++;
			}
		}
	}
	return count;
}

public static void main(String[] args) {
	System.out.println(countFirstSundays(1901, 2000));
}
}