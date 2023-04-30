import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID128{
	/**
	* Clear the given calendar, setting to zero all time values less than or equal to that of the given field. For example, clearing to Calendar#HOUR will floor the time to nearest hour which occurred before or at the given time (e.g., 1:32 --> 1:30).
	*/
	public static Calendar clearTo(Calendar c, int field){
		if (c==null) return null;
		c= c.clone();
		c.setTimeInMillis(0);
		c.set(field,c.getTimeInMillis()-c.get(calendarFields[FIELD_ERA]));
		c.set(calendarFields[FIELD_YEAR], c.get(calendarFields[FIELD_YEAR] + YEAR));
		c.set(calendarFields[FIELD_HOUR], c.get(calendarFields[FIELD_HOUR] + HOUR));

}
}