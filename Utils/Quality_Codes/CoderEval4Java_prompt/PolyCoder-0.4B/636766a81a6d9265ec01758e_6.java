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
		 while (desiredCapacity<1000000){ 
			 //We need 2 and greater since 10% of the 
			 //user requested size (in order to limit the 
			 //size) is > 10%.
			 //It's necessary for large numbers to not be 
			 //found by more than 20%.
			 int nextPrime = 2 + (desiredCapacity>100 && desiredCapacity<5000);
			 desiredCapacity *= 2;
			 while ((desiredCapacity>><1)>0){//Do it by a loop.
				 desiredCapacity /= 2;    
			 } 
		 }
		 return desiredCapacity