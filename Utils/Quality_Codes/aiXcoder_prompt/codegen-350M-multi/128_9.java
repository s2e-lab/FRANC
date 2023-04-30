import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID128{
	/**
	* Clear the given calendar, setting to zero all time values less than or equal to that of the given field. For example, clearing to Calendar#HOUR will floor the time to nearest hour which occurred before or at the given time (e.g., 1:32 --> 1:30).
	*/
	public static Calendar clearTo(Calendar c, int field){
		c.set(Calendar.HOUR_OF_DAY,0);
		if(field>Calendar.SECOND)
			c.set(Calendar.MINUTE,0);
		else if(field>Calendar.MINUTE)
			c.set(Calendar.SECOND,0);
		else if(field>Calendar.MILLISECOND)
			c.set(Calendar.MILLISECOND,0);
			return c;//TODO: do we need this?
	}
}