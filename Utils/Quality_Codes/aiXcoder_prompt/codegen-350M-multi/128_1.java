import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID128{
	/**
	* Clear the given calendar, setting to zero all time values less than or equal to that of the given field. For example, clearing to Calendar#HOUR will floor the time to nearest hour which occurred before or at the given time (e.g., 1:32 --> 1:30).
	*/
	public static Calendar clearTo(Calendar c, int field){
		Calendar result = new Calendar();
		
		int x = c.get(field);
		int ms = (((x*1000000)/1000000)+System.currentTimeMillis());
		result.setTimeInMillis(ms);
		
}
}