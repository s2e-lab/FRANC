import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID123{
	/**
	* Returns maximum possible integer, less or equal than oldValue, divisible by quantum.
	*/
	public static int floor(int x, int quantum){
		int y = 0;
		
		while ((x %  quantum)!= 0){
			x -= x % quantum;
			y++;
		}
		
		return y;
	}
	
	public static void main(String[] args) throws Exception{
		FastReader fr = new FastReader();
		long startTime = System.currentTimeMillis();
}
}