import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID70{
	/**
	* Calculate the elapsed time between two times specified in milliseconds.
	*/
	public static long elapsedTime(Calendar start, Calendar end){
		long result= end.getTimeInMillis()-start.getTimeInMillis();
		return result;
	}
}

//Powered by [KawigiEdit] 2.0!
