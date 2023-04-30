import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID12{
	/**
	* Retrieves the value by specified int index of the given List.
	*/
	public static String getValue(List<String> list, int index){
			return list.get(index);
	}

	/**
	* Retrieves the index of the first occurrence of the given value in the specified List.
	*/
	public static int getIndex(List<String> list, String value){
		return list.indexOf(value);
	}

	/**
	* Calculates the factorial of a given number using recursion.
	*/
	public static BigInteger factorial(int num){
		if(num == 0 || num == 1){
			return BigInteger.valueOf(1);
		}
		return BigInteger.valueOf(num).multiply(factorial(num-1));
	}

	/**
	* Finds the first triangular number to have over the specified number of divisors.
	*/
	public static int findTriangularNumber(int numDivisors){
		int index = 1;
		int triangularNumber = 1;
		while(true){
			int divisors = getNumberOfDivisors(triangularNumber);
			if(divisors > numDivisors){
				return triangularNumber;
			}
			index++;
			triangularNumber += index;
		}
	}

	/**
	* Calculates the number of divisors for a given number.
	*/
	public static int getNumberOfDivisors(int num){
		int count = 0;
		for(int i=1; i<=Math.sqrt(num); i++){
			if(num % i == 0){
				count++;
				if(num/i != i){
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args){
		List<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("orange");
		list.add("banana");

		System.out.println(getValue(list, 1)); // Output: orange
		System.out.println(getIndex(list, "banana")); // Output: 2

		System.out.println(factorial(5)); // Output: 120

		System.out.println(findTriangularNumber(5)); // Output: 28
	}
}