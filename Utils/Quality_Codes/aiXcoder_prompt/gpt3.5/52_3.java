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
	* Returns a new map with the same mappings as the specified map, but with all keys doubled.
	*/
	public static Map<Integer, String> doubleKeys(Map<Integer, String> mapObj){
		Map<Integer, String> doubledMap = new HashMap<Integer, String>();
		for(Integer key : mapObj.keySet()){
			doubledMap.put(key*2, mapObj.get(key));
		}
		return doubledMap;
	}

	/**
	* Returns the decimal representation of the binary number represented by the specified string.
	*/
	public static int binaryToDecimal(String binaryStr){
		// Using Java's built-in parseInt function to parse binary string to an integer, with a radix of 2
		int decimalNum = Integer.parseInt(binaryStr, 2);
		return decimalNum;
	}

	/**
	* Reverses the order of the elements in the specified array.
	*/
	public static void reverseArray(int[] arr){
		for(int i=0; i<arr.length/2; i++){
			int temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = temp;
		}
	}

	/**
	* Returns the sum of all even numbers in the specified list.
	*/
	public static int sumEvenNumbers(List<Integer> numList){
		int sum = 0;
		for(Integer num : numList){
			if(num % 2 == 0){
				sum += num;
			}
		}
		return sum;
	}
}
