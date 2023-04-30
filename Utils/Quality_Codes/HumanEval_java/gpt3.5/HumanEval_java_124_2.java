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
	// first, check if input date string is empty, return false if it is empty
        if (date.isEmpty()) {
            return false;
        }

        // next, split the date string into month, day, and year components
        String[] dateParts = date.split("-");
        
        // if the date string does not split into 3 parts, return false
        if (dateParts.length != 3) {
            return false;
        }

        // parse the month, day, and year components into integers
        int month, day, year;
        try {
            month = Integer.parseInt(dateParts[0]);
            day = Integer.parseInt(dateParts[1]);
            year = Integer.parseInt(dateParts[2]);
        } catch (NumberFormatException e) {
            // if any component is not a number, return false
            return false;
        }

        // check that month is between 1 and 12
        if (month < 1 || month > 12) {
            return false;
        }

        // check that day is valid for the given month and year
        switch (month) {
            case 2: // February, check for leap year
                if (day < 1 || day > 29) {
                    return false;
                } else if (day == 29 && (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0))) {
                    return false;
                }
                break;
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                if (day < 1 || day > 30) {
                    return false;
                }
                break;
            default: // All other months (January, March, May, July, August, October, December)
                if (day < 1 || day > 31) {
                    return false;
                }
                break;
        }

        // if we make it this far, the date must be valid
        return true;
    }
}