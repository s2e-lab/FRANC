import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID21{
	/**
	* Set the additional (undeclared) property with the specified name and value. If the property does not already exist, create it otherwise replace it.
	*/
	public static void putAdditionalProperty(String key, Object value, Map<String, Object> additionalProperties){
			additionalProperties.put(key, value);
	}

	/**
	* Compute the sum of all proper divisors of the given number.
	*/
	public static int getSumOfDivisors(int n){
		int sum = 1;
		for(int i=2; i<=Math.sqrt(n); i++){
			if(n%i==0){
				sum += i;
				if(i != n/i){
					sum += n/i;
				}
			}
		}
		return sum;
	}

	/**
	* Check if the given number is an amicable number. An amicable number is a number where the sum of its proper divisors is equal to the sum of the proper divisors of another number.
	*/
	public static boolean isAmicable(int n){
		int sum1 = getSumOfDivisors(n);
		int sum2 = getSumOfDivisors(sum1);
		return (n == sum2) && (n != sum1);
	}

	public static void main(String[] args){
		// Find all amicable numbers below 10000
		Map<String, Object> additionalProperties = new HashMap<String, Object>();
		List<Integer> amicableNumbers = new ArrayList<Integer>();
		for(int i=1; i<10000; i++){
			if(isAmicable(i)){
				amicableNumbers.add(i);
			}
		}

		// Compute the sum of all amicable numbers
		int sum = 0;
		for(int n : amicableNumbers){
			sum += n;
		}

		// Print the sum of all amicable numbers
		System.out.println("The sum of all amicable numbers below 10000 is: " + sum);
	}
}