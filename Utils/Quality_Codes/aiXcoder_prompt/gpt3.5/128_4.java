import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID128{
	/**
	* Clear the given calendar, setting to zero all time values less than or equal to that of the given field. For example, clearing to Calendar#HOUR will floor the time to nearest hour which occurred before or at the given time (e.g., 1:32 --> 1:30).
	*/
	public static Calendar clearTo(Calendar c, int field){
			c.clear(field);
	switch(field){
		case Calendar.YEAR:
			c.set(Calendar.MONTH, Calendar.JANUARY);
		case Calendar.MONTH:
			c.set(Calendar.DAY_OF_MONTH, 1);
		case Calendar.DAY_OF_MONTH:
			c.set(Calendar.HOUR_OF_DAY, 0);
		case Calendar.HOUR_OF_DAY:
			c.set(Calendar.MINUTE, 0);
		case Calendar.MINUTE:
			c.set(Calendar.SECOND, 0);
		case Calendar.SECOND:
			c.set(Calendar.MILLISECOND, 0);
			break;
		default:
			break;
	}
	return c;
}
} 

/**
 * This code will help clear the calendar field based on the input provided
 * Example usage:
 * Calendar calendar = Calendar.getInstance();
 * calendar.setTime(new Date());
 * calendar = clearTo(calendar, Calendar.HOUR_OF_DAY);
 */
