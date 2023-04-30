import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID128{
	/**
	* Clear the given calendar, setting to zero all time values less than or equal to that of the given field. For example, clearing to Calendar#HOUR will floor the time to nearest hour which occurred before or at the given time (e.g., 1:32 --> 1:30).
	*/
	public static Calendar clearTo(Calendar c, int field){
			c.clear(field+1);
for(int i = field; i >= Calendar.DAY_OF_WEEK; i--){
    c.set(i, c.getActualMinimum(i));
}
return c;
}
} 

//Note: This code snippet provides a method to clear a given calendar object up to a specific time field (e.g., clearing up to hours, minutes, seconds, etc.). It then sets all remaining calendar fields to their respective minimum values.