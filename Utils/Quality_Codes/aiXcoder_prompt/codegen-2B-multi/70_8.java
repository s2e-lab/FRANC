import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID70{
	/**
	* Calculate the elapsed time between two times specified in milliseconds.
	*/
	public static long elapsedTime(Calendar start, Calendar end){
		long startTime=start.getTimeInMillis();
		long endTime=end.getTimeInMillis();
		return endTime - startTime;
	}


	public static void main (String[] args) throws java.lang.Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
}
}