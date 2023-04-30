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
				c.set(Calendar.MONTH, 0);
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
		}
		return c;
	}
	
	/**
	* Generate a unique ID based on the current date and time. The format of the ID is "yyyyMMddHHmmssSSS", where:
	*	- yyyy: year
	*	- MM: month (01-12)
	*	- dd: day of month (01-31)
	*	- HH: hour of day (00-23)
	*	- mm: minute (00-59)
	*	- ss: second (00-59)
	*	- SSS: millis (000-999)
	*/
	public static String generateID(){
		Calendar now = Calendar.getInstance();
		now = clearTo(now, Calendar.MILLISECOND);
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		return formatter.format(now.getTime());
	}

	public static void main(String[] args) {
		String id = generateID();
		System.out.println("Generated ID: " + id);
	}
}