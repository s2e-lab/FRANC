import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID75{
	/**
	* Get the number of days for the given month in the given year.
	*/
	public static int getDaysInMonth(int year, int month){
			// Check if the month is February
		if(month == 2){
			// Check if the year is a leap year
			if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
				return 29;
			}else{
				return 28;
			}
		}else{
			// Check for 31-day months
			if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
				return 31;
			}else{
				return 30;
			}
		}
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the year: ");
		int year = sc.nextInt();
		System.out.print("Enter the month: ");
		int month = sc.nextInt();
		int numDays = getDaysInMonth(year, month);
		System.out.println("The number of days in the month is: " + numDays);
	}
}