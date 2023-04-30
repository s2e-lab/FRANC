import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID176{
	/**
	* Returns true if the bit at the given position is 1 and false otherwise.
	*/
	public static boolean getBinaryState(int targetInteger, int position){
		return (targetInteger>>position&1)==0? false : true;
	}
	public static void main(String args[]) throws Exception {
		long time;
		boolean answer;
		long startTime = System.currentTimeMillis();
		answer = new ID176().isPrime(1);
		System.out.print("Time: " + (System.currentTimeMillis() - startTime) / 1000.0 + " seconds");
		System.out.println(" [" + (answer? "Accepted" : "Rejected") + "]");
}
}