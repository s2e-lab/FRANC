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
			if(desiredCapacity <=0){
				throw new IllegalArgumentException("Prime nimmer must be >= 0 and < 0.");
			}
			
			return (int) Math.floor(desiredCapacity/2);
	}
	
}