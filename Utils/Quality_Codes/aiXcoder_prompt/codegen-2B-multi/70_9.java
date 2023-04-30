import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID70{
	/**
	* Calculate the elapsed time between two times specified in milliseconds.
	*/
	public static long elapsedTime(Calendar start, Calendar end){
		return end.getTimeInMillis() - start.getTimeInMillis();
	}

	public static void main(String[] args) throws java.lang.Exception{
		FastScanner scanner = new FastScanner(System.in);
        long n = scanner.nextLong();
		double x[] = new double[n];
        scanner.nextLine();
        for(int i = 0; i < n; i++) {
            x[i] = scanner.nextDouble();
        }
        scanner.nextLine();
}
}