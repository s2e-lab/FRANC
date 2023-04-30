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
		switch (month) {
			case 1: //January
			case 3: //March
			case 5: //May
			case 7: //July
			case 8: //August
			case 10: //October
			case 12: //December
				daysInMonth = 31;
				break;
			case 4: //April
			case 6: //June
			case 9: //September
			case 11: //November
				daysInMonth = 30;
				break;
			case 2: //February
				if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
					daysInMonth = 29;
				} else {
					daysInMonth = 28;
				}
				break;
			default:
				System.out.println("Invalid month.");
				break;
		}
		return daysInMonth;
	}

	/**
	* Get the number of days between two given dates.
	*/
	public static int getDaysBetweenDates(String date1, String date2){
		//parse the string dates to date format
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d1 = null;
		Date d2 = null;
		try{
			d1 = sdf.parse(date1);
			d2 = sdf.parse(date2);
		}catch(Exception e){
			System.out.println("Invalid date format.");
		}

		//calculate the number of days between the two dates
		long diffInMillies = Math.abs(d2.getTime() - d1.getTime());
    	long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);

		return (int)diff;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		//take input dates from user
		System.out.println("Enter first date (YYYY-MM-DD): ");
		String date1 = sc.nextLine();
		System.out.println("Enter second date (YYYY-MM-DD): ");
		String date2 = sc.nextLine();

		//calculate the number of days between the two dates
		int daysBetweenDates = getDaysBetweenDates(date1, date2);
		System.out.println("Number of days between the two dates: " + daysBetweenDates);

		//calculate the number of days in the month of the first
}
}