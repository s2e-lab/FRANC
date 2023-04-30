import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID128{
	/**
	* Clear the given calendar, setting to zero all time values less than or equal to that of the given field. For example, clearing to Calendar#HOUR will floor the time to nearest hour which occurred before or at the given time (e.g., 1:32 --> 1:30).
	*/
	public static Calendar clearTo(Calendar c, int field){
			c.set(Calendar.MILLISECOND, 0); // Clear milliseconds
	c.set(Calendar.SECOND, 0); // Clear seconds
	if (field <= Calendar.MINUTE) {
		// Clear minutes and beyond
		c.set(Calendar.MINUTE, 0);
		if (field <= Calendar.HOUR_OF_DAY) {
			// Clear hours and beyond
			c.set(Calendar.HOUR_OF_DAY, 0);
			if (field <= Calendar.DATE) {
				// Clear date and beyond
				c.set(Calendar.DATE, 1);
				if (field <= Calendar.MONTH) {
					// Clear month and beyond
					c.set(Calendar.MONTH, 0);
					if (field <= Calendar.YEAR) {
						// Clear year and beyond
						c.set(Calendar.YEAR, 0);
					}
				}
			}
		}
	}
	return c;
}

public static void main(String[] args) {
	Calendar cal = Calendar.getInstance();

	System.out.println("Before clearing: " + cal.getTime());

	// Clear to HOUR_OF_DAY (floor to nearest hour)
	cal = clearTo(cal, Calendar.HOUR_OF_DAY);

	System.out.println("After clearing: " + cal.getTime());
}
}