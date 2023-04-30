import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID107{
	/**
	* Return true if the given array is not null or empty.
	*/
	public boolean checkNotNullOrEmpty(int[] array){
			if(array != null && array.length > 0) {
				return true;
			}
			return false;
	}
	
	/**
	* Return true if the given string is not null or empty.
	*/
	public boolean checkNotNullOrEmpty(String str){
		if(str != null && !str.isEmpty()) {
			return true;
		}
		return false;
	}
	
	/**
	* Convert the given integer to a binary string representation in 2's complement.
	*/
	public String intToBinaryString(int num){
		String binaryString = Integer.toBinaryString(num);
		// Add leading zeros if required
		while(binaryString.length() < 32) {
			binaryString = "0" + binaryString;
		}
		// Invert the bits
		binaryString = binaryString.replaceAll("0", "x");
		binaryString = binaryString.replaceAll("1", "0");
		binaryString = binaryString.replaceAll("x", "1");
		// Add 1
		char[] charArray = binaryString.toCharArray();
		for(int i=charArray.length-1; i>=0; i--) {
			if(charArray[i] == '0') {
				charArray[i] = '1';
				break;
			} else {
				charArray[i] = '0';
			}
		}
		binaryString = new String(charArray);
		return binaryString;
	}
	
	/**
	* Sorts the given array of integers in ascending order.
	*/
	public int[] sortIntArray(int[] array){
		Arrays.sort(array);
		return array;
	}
	
	/**
	* Returns the product of the maximum negative integer and the minimum positive integer 
	* from the given array of integers.
	*/
	public int maxNegativeMinPositiveProduct(int[] array){
		int maxNegative = Integer.MIN_VALUE;
		int minPositive = Integer.MAX_VALUE;
		for(int num : array) {
			if(num < 0 && num > maxNegative) {
				maxNegative = num;
			}
			if(num > 0 && num < minPositive) {
				minPositive = num;
			}
		}
		return maxNegative * minPositive;
	}
	
	/**
	* Returns the index of the first occurrence of the given character in the given string.
	* If the character is not found, returns -1.
	*/
	public int indexOfChar(String str, char ch){
}
}