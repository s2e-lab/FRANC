import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID52{
	/**
	* Removes the entry with the specified key from this map if present.
	*/
	public static void remove(Map<Integer, String> mapObj, Integer key){
			mapObj.remove(key);
	}
	
	/**
	* Returns the sum of digits of the given integer.
	*/
	public static int sumOfDigits(int num){
		int sum = 0;
		while(num > 0){
			sum += num % 10;
			num /= 10;
		}
		return sum;
	}
	
	/**
	* Returns true if the given number has the same digits as the multiples of it up to a given limit.
	*/
	public static boolean hasSameDigits(int num, int limit){
		for(int i=2; i<=limit; i++){
			if(sumOfDigits(num) != sumOfDigits(num*i)){
				return false;
			}
		}
		return true;
	}
	
	/**
	* Returns the smallest positive integer that has the same digits as the multiples of it up to a given limit.
	*/
	public static int smallestInteger(int limit){
		int num = 1;
		while(!hasSameDigits(num, limit)){
			num++;
		}
		return num;
	}
	
	public static void main(String[] args){
		int limit = 6;
		System.out.println(smallestInteger(limit));
	}
} 

