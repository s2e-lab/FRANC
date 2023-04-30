import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID70{
	/**
	* Calculate the elapsed time between two times specified in milliseconds.
	*/
	public static long elapsedTime(Calendar start, Calendar end){
		long t1=(end.getTime().getTime()-start.getTime().getTime()) / 1000;
		long t2=(end.getTime().getTime() - start.getTime().getTime());
		return t1+t2;
	}

	/**
	* Generate random string that can be used as password.
	* Can have a string length that will be longer than a password length.
	*/
	public static String randomString(int length){
		StringBuffer buffer = new StringBuffer();
		int i;
}
}