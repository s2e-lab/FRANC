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
	* Get the additional (undeclared) property with the specified name.
	*/
	public static Object getAdditionalProperty(String key, Map<String, Object> additionalProperties){
			return additionalProperties.get(key);
	}

	/**
	* Calculates the sum of all amicable numbers below the specified limit.
	*/
	public static int sumAmicableNumbers(int limit){
		int sum = 0;
		for(int i=1; i<limit; i++){
			int a = sumOfProperDivisors(i);
			int b = sumOfProperDivisors(a);
			if(i == b && a != b){
				sum += i;
			}
		}
		return sum;
	}

	/**
	* Calculates the sum of the proper divisors of the specified number.
	*/
	public static int sumOfProperDivisors(int number){
		int sum = 1;
		for(int i=2; i<=Math.sqrt(number); i++){
			if(number % i == 0){
				sum += i;
				if(i != number/i){
					sum += number/i;
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Map<String, Object> additionalProperties = new HashMap<>();

		//Testing putAdditionalProperty method
		putAdditionalProperty("name", "John", additionalProperties);
		putAdditionalProperty("age", 25, additionalProperties);
		putAdditionalProperty("isMarried", false, additionalProperties);

		//Testing getAdditionalProperty method
		System.out.println(getAdditionalProperty("name", additionalProperties));
		System.out.println(getAdditionalProperty("age", additionalProperties));
		System.out.println(getAdditionalProperty("isMarried", additionalProperties)); 

		//Calculating and printing sum of all amicable numbers below 10000
		System.out.println("Sum of all amicable numbers below 10000: " + sumAmicableNumbers(10000));
	}
}