import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID156{
	/**
	* Adds a given vector (array) to another one. * Every element of the second array (missing element is treated to be zero) is added to the corresponding element (if not missing) of the first array.
	*/
	public static void addTo(float[] arrayA, float[] arrayB){
			for(int i=0; i<arrayA.length; i++){
				if(i<arrayB.length){ //if arrayB has an element corresponding to arrayA
					arrayA[i] += arrayB[i];
				}
			}
		}
	
	/**
	* Given a number, this method determines whether it is a palindrome or not.
	*/
	public static boolean isPalindrome(int num){
		int reverseNum = 0;
		int originalNum = num;
		while(num != 0){
			int remainder = num % 10;
			reverseNum = reverseNum * 10 + remainder;
			num = num / 10;
		}
		return originalNum == reverseNum;
	}
	
	/**
	* Given a number, this method determines whether it is a power of two or not.
	*/
	public static boolean isPowerOfTwo(int num){
		if(num <= 0){
			return false;
		}
		return ((num & (num-1)) == 0);
	}
	
	/**
	* Given a decimal number and a base, this method converts the decimal number to a string representation in the specified base.
	*/
	public static String decimalToBase(int decimal, int base){
		String result = "";
		while(decimal > 0){
			int remainder = decimal % base;
			if(remainder < 10){
				result = remainder + result;
			}
			else{
				result = (char)(remainder - 10 + 'A') + result;
			}
			decimal = decimal / base;
		}
		return result;
	}
}