import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID107{
	/**
	* Return true if the given array is not null or empty.
	*/
	public boolean checkNotNullOrEmpty(int[] array){
			if(array != null && array.length != 0){
			return true;
		}
		return false;
	}

	/**
	* Return the sum of all even numbers in the array.
	* If the array is null or empty, return 0.
	*/
	public int sumOfEvenNumbers(int[] array){
		if(checkNotNullOrEmpty(array)){
			int sum = 0;
			for(int num : array){
				if(num % 2 == 0){
					sum += num;
				}
			}
			return sum;
		}
		return 0;
	}

	/**
	* Return the maximum number in the array.
	* If the array is null or empty, return Integer.MIN_VALUE.
	*/
	public int maximumNumber(int[] array){
		if(checkNotNullOrEmpty(array)){
			int maxNum = Integer.MIN_VALUE;
			for(int num : array){
				if(num > maxNum){
					maxNum = num;
				}
			}
			return maxNum;
		}
		return Integer.MIN_VALUE;
	}

	/**
	* Return an array with all prime numbers in the input array.
	* If the array is null or empty or does not contain any prime numbers, return an empty array.
	*/
	public int[] primeNumbers(int[] array){
		if(checkNotNullOrEmpty(array)){
			ArrayList<Integer> primes = new ArrayList<Integer>();
			for(int num : array){
				if(num > 1 && isPrime(num)){
					primes.add(num);
				}
			}
			int[] primeArray = new int[primes.size()];
			for(int i = 0; i < primes.size(); i++){
				primeArray[i] = primes.get(i);
			}
			return primeArray;
		}
		return new int[0];
	}

	/**
	* Helper function to check whether the given number is prime or not.
	*/
	private boolean isPrime(int num){
		for(int i = 2; i <= Math.sqrt(num); i++){
			if(num % i == 0){
				return false;
			}
		}
		return true;
	}
}