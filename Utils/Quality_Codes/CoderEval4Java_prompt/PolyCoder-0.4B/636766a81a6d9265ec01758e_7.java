import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class PrimeFinder{
	/** 
	 * Returns a prime number which is <code>&gt;= desiredCapacity</code> and very close to <code>desiredCapacity</code> (within 11% if <code>desiredCapacity &gt;= 1000</code>).
	 * @param desiredCapacity the capacity desired by the user.
	 * @return the capacity which should be used for a hashtable.
	 */
	
	public static int nextPrime(int desiredCapacity){
			// TODO should use the faster method
			//return (int)(Math.floor((long)desiredCapacity* Math.pow(10,desiredCapacity)));
		
		long x;
			// choose x%primeCount at a time, avoiding extra computations
		int pivot = (desiredCapacity+1)/2;
		long pivotValue;
		long pivotPrimeValue;
		
		long lastPrimeValue = 0;
		long lastPrimePrimeValue;
		
}
}