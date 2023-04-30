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
	* Get the value of the additional (undeclared) property with the specified name, or null if it does not exist.
	*/
	public static Object getAdditionalProperty(String key, Map<String, Object> additionalProperties){
		return additionalProperties.get(key);
	}

	/**
	* A method to calculate the sum of proper divisors of a number
	*/
	public static int sumOfProperDivisors(int num){
		int sum = 0;
		for(int i=1;i<num;i++){
			if(num%i==0){
				sum+=i;
			}
		}
		return sum;
	}

	/**
	* Method to check if the given number is an amicable number
	*/
	public static boolean isAmicableNumber(int num, Map<String, Object> additionalProperties){
		int sumOfDivisors = sumOfProperDivisors(num);
		if(num == sumOfDivisors){
			return false;
		}
		int sumOfDivisorsOfSum = sumOfProperDivisors(sumOfDivisors);
		if(num==sumOfDivisorsOfSum){
			putAdditionalProperty("pair", sumOfDivisors, additionalProperties);
			return true;
		}
		return false;
	}

	public static void main(String[] args){
		Map<String, Object> additionalProperties = new HashMap<>();
		int sum = 0;
		for(int i=1;i<10000;i++){
			if(isAmicableNumber(i, additionalProperties)){
				sum+=i;
			}
		}
		System.out.println("The sum of all amicable numbers under 10000 is "+sum);
	}
}