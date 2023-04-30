import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID70{
	/**
	* Calculate the elapsed time between two times specified in milliseconds.
	*/
	public static long elapsedTime(Calendar start, Calendar end){
		long dayInMillisecond = (long)((1000 * 24 * 60 * 60));
		Date dateStart = start.getTime();
		Date dateEnd = end.getTime();
		long day = dateStart.getTime() - dateEnd.getTime() - dayInMillisecond - 1;
		return day;
	}

	public static void main(String[] args) throws IOException {
		System.out.println("=== ID70 ===");
		// TODO Auto-generated method stub
		String data = FileUtil.readFile();
		
}
}