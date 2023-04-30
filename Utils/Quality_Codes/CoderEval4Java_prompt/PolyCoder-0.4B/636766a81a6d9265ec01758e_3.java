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
			int result=desiredCapacity;
			if(desiredCapacity==0){
				//if we are all set, but we're not at a prime, we're not really prime, so we have to set 1, which should be enough
				result=100000;
			}else if(desiredCapacity*15>desiredCapacity){
				//if the user didn't set the desiredCapacity, we should use that as our desired_prime
				result=desiredCapacity*15;
			}
			 
			return result;
		}
	

}