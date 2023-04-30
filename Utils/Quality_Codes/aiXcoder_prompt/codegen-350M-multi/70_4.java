import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID70{
	/**
	* Calculate the elapsed time between two times specified in milliseconds.
	*/
	public static long elapsedTime(Calendar start, Calendar end){
		Calendar startt = new GregorianCalendar();
		startt.setTime(start);
		Calendar finish = new GregorianCalendar();
		finish.setTime(end);
		return startt.getTimeInMillis()-finish.getTimeInMillis();

	}
}
