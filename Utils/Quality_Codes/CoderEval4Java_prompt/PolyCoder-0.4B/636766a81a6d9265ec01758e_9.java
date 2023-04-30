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
		 return nextPrime(desiredCapacity, Integer.MAX_VALUE);
	}
	/** 
	 * Returns a prime number which is <code>&gt;= desiredCapacity</code> and close to <code>desiredCapacity</code>, and in <code>optimalCapacity</code> where optimalCapacity &gt;= 1000.
	 * @param desiredCapacity the capacity desired by the user.
	 * @param optimalCapacity the ideal (optimal) capacity.
	 * @return the capacity which should be used for a hashtable.
	 */
	
}