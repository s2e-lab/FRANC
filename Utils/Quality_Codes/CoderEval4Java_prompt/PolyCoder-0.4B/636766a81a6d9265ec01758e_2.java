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
			return (int)Math.round(intMod(desiredCapacity, 11));
		}
	/** returns the next prime number >= DesiredCapacity if it is prime. */
	public int nextPrime(int desiredCapacity){
		while (nextPrime(desiredCapacity) < desiredCapacity)
			if (nextPrime(desiredCapacity) < desiredCapacity)
			return desiredCapacity;
		return nextPrime(desiredCapacity);
	}
}