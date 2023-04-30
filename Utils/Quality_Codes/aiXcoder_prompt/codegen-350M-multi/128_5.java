import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID128{
	/**
	* Clear the given calendar, setting to zero all time values less than or equal to that of the given field. For example, clearing to Calendar#HOUR will floor the time to nearest hour which occurred before or at the given time (e.g., 1:32 --> 1:30).
	*/
	public static Calendar clearTo(Calendar c, int field){
		//calendar starts from the first day after the given date.
		int day = c.get(Calendar.DAY_OF_MONTH);
		c.set(Calendar.DAY_OF_MONTH,0);
		c.add(Calendar.ONE, field, c);
		return c;
	}
	
	/**
	* Return the previous calendar, which is the given calendar with the time before the given time, or the current.
	*/
	public static Calendar previous(Calendar c, long t){
		assert c!=null;
}
}