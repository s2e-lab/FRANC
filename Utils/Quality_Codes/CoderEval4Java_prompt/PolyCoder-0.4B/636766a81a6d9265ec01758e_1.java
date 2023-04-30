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
			return computePrime(desiredCapacity, true);
	}

	public static int nextPrime(int desiredCapacity, boolean alwaysUsePrimes){
			return computePrime(desiredCapacity, alwaysUsePrimes? true : false);
	}

	private static int computePrime(int desiredCapacity, boolean alwaysUsePrimes){
			int primeCount = 1 << 15;  // 16777215 (see JPL 3.7.1)
			int primeLimit = primeCount - 1;
			int primes = 0;

}
}