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
				//Months which have 31 days
				case 1: //January
				case 3: //March
				case 5: //May
				case 7: //July
				case 8: //August
				case 10: //October
				case 12: //December
					days = 31;
					break;
				//Months which have 30 days
				case 4: //April
				case 6: //June
				case 9: //September
				case 11: //November
					days = 30;
					break;
				//February
				default:
					//Check if it's a leap year
					if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
						days = 29; //Leap year
					}
					else{
						days = 28; //Non-leap year
					}
			}
			return days;
		}

	/**
	* Find the number of months that have more than the given number of Sundays on the first of the month
	* between the years startYear and endYear (inclusive)
	*/
	public static int getNumMonths(int startYear, int endYear, int numSundays){
		int numMonths = 0;
		//Loop through each year
		for(int year = startYear; year <= endYear; year++){
			//Loop through each month
			for(int month = 1; month <= 12; month++){
				//Use the getDaysInMonth method to find the number of days in the month
				int numDays = getDaysInMonth(year, month);
				//Create a Calendar object for the first day of the month
				Calendar cal = new GregorianCalendar(year, month - 1, 1);
				//Check if the first day of the month is a Sunday
				if(cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY){
					//Increment the counter if it is
					numMonths++;
				}
			}
		}
		return numMonths;
	}

	public static void main(String[] args){
		//Test the getNumMonths method
		int numMonths = getNumMonths(1901, 2000, 1);
}
}