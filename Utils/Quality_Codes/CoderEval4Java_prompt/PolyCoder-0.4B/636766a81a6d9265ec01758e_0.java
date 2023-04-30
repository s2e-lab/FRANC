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
			if ( desiredCapacity<=0) return 0;
			
			long bitsForLowWater=desiredCapacity/10; // a bit waste.  for 32bit machines we have two factors; see primeHash.h for more detail
			int i=0;
}
}