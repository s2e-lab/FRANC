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
		 int size = 0;
		 int count = 0;
	    int resultSize; 
	  	
		while (true){
			 if (desiredCapacity==0){
				 size++; 
				 count++;
			 }
			 desiredCapacity++;
			count++;
			 }
			 if(count<=desiredCapacity){
				 return size;
			 }
			else {
				 resultSize = count;
				 count=0;
				 }
		}
		
	public static class PrimeFinderCache extends ConcurrentHashMap<String,Integer> {
	};
	
	
}