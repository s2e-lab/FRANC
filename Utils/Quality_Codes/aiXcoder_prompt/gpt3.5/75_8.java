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
            if(isLeapYear(year)){
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
* Check if the given year is a leap year.
*/
public static boolean isLeapYear(int year){
    boolean isLeap = false;
    if(year % 4 == 0){
        if(year % 100 == 0){
            if(year % 400 == 0){
                isLeap = true;
            }
        }else{
            isLeap = true;
        }
    }
    return isLeap;
}

/**
* Main method to run the program.
*/
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter year: ");
    int year = sc.nextInt();
    System.out.print("Enter month: ");
    int month = sc.nextInt();
    int daysInMonth = getDaysInMonth(year, month);
    System.out.println("Number of days in month " + month + " of year " + year + " is: " + daysInMonth);
} 
}