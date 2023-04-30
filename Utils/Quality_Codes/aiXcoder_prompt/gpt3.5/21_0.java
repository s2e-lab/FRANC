import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID21{
	/**
	* Set the additional (undeclared) property with the specified name and value. If the property does not already exist, create it otherwise replace it.
	*/
	public static void putAdditionalProperty(String key, Object value, Map<String, Object> additionalProperties){
			additionalProperties.put(key, value); // This line of code adds a new key-value pair to the map of additional properties, or updates the value of an existing key.
	}

	public static void main(String[] args){
		int targetNumber = 10000;
		Map<Integer, Integer> divisorSums = new HashMap<Integer, Integer>();
		Map<String, Object> additionalProperties = new HashMap<String, Object>();
		List<Integer> amicableNumbers = new ArrayList<Integer>();
		
		for(int i=1; i<=targetNumber; i++){
			int divisorSum = getDivisorSum(i);
			divisorSums.put(i, divisorSum);
			
			if(divisorSums.containsKey(divisorSum) && divisorSums.get(divisorSum) == i && divisorSum != i){
				amicableNumbers.add(i);
				amicableNumbers.add(divisorSum);
			}
		}
		
		int sumOfAmicableNumbers = 0;
		for(Integer num : amicableNumbers){
			sumOfAmicableNumbers += num;
		}
		
		additionalProperties.put("Amicable numbers", amicableNumbers); // Add a set of amicable numbers to the map of additional properties
		additionalProperties.put("Sum of amicable numbers", sumOfAmicableNumbers); // Add the sum of amicable numbers to the map
		
		System.out.println("Sum of amicable numbers under " + targetNumber + " is " + sumOfAmicableNumbers);
	}
	
	/**
	* Get the sum of proper divisors of a given number.
	*/
	public static int getDivisorSum(int num){
		int sum = 0;
		for(int i=1; i<=num/2; i++){
			if(num % i == 0){
				sum += i;
			}
		}
		return sum;
	}
}