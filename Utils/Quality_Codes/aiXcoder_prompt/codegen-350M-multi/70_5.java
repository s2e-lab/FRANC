import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID70{
	/**
	* Calculate the elapsed time between two times specified in milliseconds.
	*/
	public static long elapsedTime(Calendar start, Calendar end){
		if(start==null)
			start=Calendar.getInstance();
		synchronized(_clock)
		{
			return _clock.elapsedTime(start.getTime(), end.getTime());
		}
	}
}