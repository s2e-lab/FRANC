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
		
		// checking if the month is February for leap year calculation
		if (month == 2) {
			if (year % 4 == 0) {
				if (year % 100 == 0) {
					if (year % 400 == 0)
						days = 29;
					else
						days = 28;
				} else
					days = 29;
			} else
				days = 28;
		} else {
			// checking for the rest of the months
			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				days = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				days = 30;
				break;
			default:
				System.out.println("Invalid Month");
			}
		}
		return days;
	}
	
	/**
	 * Main function.
	 */
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int year, month;
		
		// Asking for input
		System.out.print("Enter year: ");
		year = sc.nextInt();
		System.out.print("Enter month (1-12): ");
		month = sc.nextInt();
		
		// Getting number of days in the given month of the given year
		int days = getDaysInMonth(year, month);
		
		// Displaying the result
		System.out.println("Number of days in the given month of the given year: "+ days);
	}
}