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
	* Find the sum of all the proper divisors of n (numbers less than n which divide evenly into n).
	*/
	public static long sumOfProperDivisors(long n) {
		long sum = 1;
		for (long i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				sum += i + (n / i);
			}
			if (i * i == n) {
				sum -= i;
			}
		}
		return sum;
	}

	/**
	* Find all amicable numbers under the specified limit.
	*/
	public static List<Long> findAmicableNumbers(long limit){
		List<Long> amicableNumbers = new ArrayList<>();
		Map<Long, Long> divisorSums = new HashMap<>();
		
		// Calculate the sum of proper divisors for each number under the limit
		for (long i = 1; i < limit; i++) {
			divisorSums.put(i, sumOfProperDivisors(i));
		}
		
		// Check for amicable numbers
		for (long a = 1; a < limit; a++) {
			Long b = divisorSums.get(a);
			if (b != null && !b.equals(a) && divisorSums.get(b) != null && divisorSums.get(b).equals(a)) {
				amicableNumbers.add(a);
			}
		}
		
		return amicableNumbers;
	}


	public static void main(String[] args){
		Map<String, Object> additionalProperties = new HashMap<String, Object>();
		putAdditionalProperty("problem", 21, additionalProperties);
		putAdditionalProperty("description", "Evaluate the sum of all the amicable numbers under 10000.", additionalProperties);
		System.out.println(additionalProperties.get("description"));

		List<Long> amicableNumbers = findAmicableNumbers(10000);
		long sum = 0;
		for (Long amicableNumber : amicableNumbers) {
			sum += amicableNumber;
		}
		System.out.println("The sum of all the amicable numbers under 10000 is " + sum);
	}
}