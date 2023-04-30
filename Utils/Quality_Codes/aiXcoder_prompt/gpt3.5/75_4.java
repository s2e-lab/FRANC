import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID75{
	/**
	* Get the number of days for the given month in the given year.
	*/
	public static int getDaysInMonth(int year, int month){
			if(month==2){
            if(isLeapYear(year)){
                return 29;
            }
            else{
                return 28;
            }
        }
        else if(month==4 || month==6 || month==9 || month==11){
            return 30;
        }
        else{
            return 31;
        }
    }
    
    /**
    * Check if the given year is a leap year.
    */
    public static boolean isLeapYear(int year){
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    return true;
                }
                else{
                    return false;
                }
            }
            else{
                return true;
            }
        }
        else{
            return false;
        }
    }
    
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the year:");
        int year=scanner.nextInt();
        System.out.println("Enter the month (1-12):");
        int month=scanner.nextInt();
        int days=getDaysInMonth(year, month);
        System.out.println("Days in month "+month+" of year "+year+": "+days);
    }
}