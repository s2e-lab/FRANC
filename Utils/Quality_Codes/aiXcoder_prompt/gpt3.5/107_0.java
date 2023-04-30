import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID107{
	/**
	* Return true if the given array is not null or empty.
	*/
	public boolean checkNotNullOrEmpty(int[] array){
			if(array != null && array.length > 0){
			return true;
		}
		else{
			return false;
		}
	}
	
	/**
	* Return the sum of all even integers in the given array.
	* If the array is null or empty, return 0.
	*/
	public int sumOfEvenIntegers(int[] array){
		if(checkNotNullOrEmpty(array)){
			int sum = 0;
			for(int i = 0; i < array.length; i++){
				if(array[i] % 2 == 0){
					sum += array[i];
				}
			}
			return sum;
		}
		else{
			return 0;
		}
	}
	
	/**
	* Return the largest integer in the given array.
	* If the array is null or empty, return Integer.MIN_VALUE.
	*/
	public int findLargestInteger(int[] array){
		if(checkNotNullOrEmpty(array)){
			int max = array[0];
			for(int i = 1; i < array.length; i++){
				if(array[i] > max){
					max = array[i];
				}
			}
			return max;
		}
		else{
			return Integer.MIN_VALUE;
		}
	}
	
	/**
	* Return the number of integers in the given array that are divisible by the given divisor.
	* If the array is null or empty, return 0.
	*/
	public int countDivisibleIntegers(int[] array, int divisor){
		if(checkNotNullOrEmpty(array)){
			int count = 0;
			for(int i = 0; i < array.length; i++){
				if(array[i] % divisor == 0){
					count++;
				}
			}
			return count;
		}
		else{
			return 0;
		}
	}
	
	/**
	* Return the factorial of the given integer.
	* If the integer is negative, return -1.
	*/
	public BigInteger getFactorial(int num){
		if(num < 0){
			return BigInteger.valueOf(-1);
		}
		else if(num == 0){
			return BigInteger.valueOf(1);
		}
		else{
			BigInteger fact = BigInteger.valueOf(1);
			for(int i = 1; i <= num; i++){
				fact = fact.multiply(BigInteger.valueOf(i));
			}
			return fact;
		}
	}
}
