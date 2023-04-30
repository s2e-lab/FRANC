import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID70{
	/**
	* Calculate the elapsed time between two times specified in milliseconds.
	*/
	public static long elapsedTime(Calendar start, Calendar end){
		Vector v1 = new Vector();
		int count = 0;
		int c = 0;

		if(start == null){
			start = Calendar.getInstance();
		}
		if(end == null){
			end = Calendar.getInstance();
		}

		while(c!= -1){
			v1.addElement(start.getTime());
			start.add(Calendar.MILLISECOND, 1000 * c);
			c = v1.size();
		}

}
}