import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ValidDate {
    /**
     * You have to write a function which validates a given date string and
     * returns True if the date is valid otherwise False.
     * The date is valid if all of the following rules are satisfied:
     * 1. The date string is not empty.
     * 2. The number of days is not less than 1 or higher than 31 days for months 1,3,5,7,8,10,12. And the number of days is not less than 1 or higher than 30 days for months 4,6,9,11. And, the number of days is not less than 1 or higher than 29 for the month 2.
     * 3. The months should not be less than 1 or higher than 12.
     * 4. The date should be in the format: mm-dd-yyyy

     * for example: 
     * valid_date('03-11-2000') => True

     * valid_date('15-01-2012') => False

     * valid_date('04-0-2040') => False

     * valid_date('06-04-2020') => True

     * valid_date('06/04/2020') => False
     *
     * > validDate("03-11-2000")
     * true
     * > validDate("15-01-2012")
     * false
     * > validDate("04-0-2040")
     * false
     * > validDate("06-04-2020")
     * true
     * > validDate("01-01-2007")
     * true
     * > validDate("03-32-2011")
     * false
     * > validDate("")
     * false
     * > validDate("04-31-3000")
     * false
     * > validDate("06-06-2005")
     * true
     * > validDate("21-31-2000")
     * false
     * > validDate("04-12-2003")
     * true
     * > validDate("04122003")
     * false
     * > validDate("20030412")
     * false
     * > validDate("2003-04")
     * false
     * > validDate("2003-04-12")
     * false
     * > validDate("04-2003")
     * false
     */
    public static Boolean validDate(String date) {
	// Check if the date string is empty
        if(date.length() == 0) {
            return false;
        }
        
        // Check if the date is in the correct format
        String[] dateParts = date.split("-");
        if(dateParts.length != 3 || date.indexOf("-") == -1) {
            return false;
        }
        
        // Parse the date parts
        int month = 0, day = 0, year = 0;
        try {
            month = Integer.parseInt(dateParts[0]);
            day = Integer.parseInt(dateParts[1]);
            year = Integer.parseInt(dateParts[2]);
        } catch(NumberFormatException ex) {
            return false;
        }
        
        // Check if the month is within range
        if(month < 1 || month > 12) {
            return false;
        }
        
        // Check if the day is valid for this month
        if(day < 1 || day > 31) {
            return false;
        }
        if(month == 2 && day > 29) {
            return false;
        }
        if((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
            return false;
        }
        
        // Check if the year is valid
        if(year < 1 || year > 9999) {
            return false;
        }
        
        // Return true if the date is valid
        return true;
    }
}