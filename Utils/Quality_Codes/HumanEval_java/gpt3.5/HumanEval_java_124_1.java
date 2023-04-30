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
	// First, we need to check if the input string is empty
        if (date == null || date.length() == 0) {
            return false;
        }

        // Then, we need to check if the date is in the correct format (mm-dd-yyyy)
        String[] dateArr = date.split("-");
        if (dateArr.length != 3) {
            return false;
        }

        // Next, we need to check if the values for month, day, and year are valid integers
        int month, day, year;
        try {
            month = Integer.parseInt(dateArr[0]);
            day = Integer.parseInt(dateArr[1]);
            year = Integer.parseInt(dateArr[2]);
        } catch (NumberFormatException e) {
            return false;
        }

        // We need to check if month, day, and year are within their respective valid ranges
        if (month < 1 || month > 12) {
            return false;
        }

        if (day < 1 || day > 31) {
            return false;
        }

        // February can have at most 29 days, unless it's a leap year (divisible by 4 and not 100 unless also divisible by 400)
        if (month == 2) {
            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                if (day > 29) {
                    return false;
                }
            } else {
                if (day > 28) {
                    return false;
                }
            }
        }

        // April, June, September, and November can have at most 30 days
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day > 30) {
                return false;
            }
        }

        // All other months have at most 31 days
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            if (day > 31) {
                return false;
            }
        }

        // If we reach this point, the date is valid
        return true;
    }
}