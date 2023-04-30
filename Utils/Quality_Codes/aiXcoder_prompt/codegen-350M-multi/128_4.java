import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID128{
	/**
	* Clear the given calendar, setting to zero all time values less than or equal to that of the given field. For example, clearing to Calendar#HOUR will floor the time to nearest hour which occurred before or at the given time (e.g., 1:32 --> 1:30).
	*/
	public static Calendar clearTo(Calendar c, int field){
		Calendar clr = (Calendar)c.clone(); 
		clr.set(Calendar.HOUR_OF_DAY, 0);
		clr.set(Calendar.MINUTE, 0);
		clr.set(Calendar.SECOND, 0);
		clr.set(Calendar.MILLISECOND, 0);
		clr.set(Calendar.DAY_OF_YEAR, 0);
		clr.set(Calendar.MONTH, 0);
}
}