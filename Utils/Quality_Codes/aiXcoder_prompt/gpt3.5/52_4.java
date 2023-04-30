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
	* Returns the first non-repeated character in a given string.
	* If all characters are repeated, return null.
	*/
	public static Character firstNonRepeatedChar(String s) {
		HashMap<Character,Integer> freqMap = new HashMap<>();
		for(char c: s.toCharArray()) {
			freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
		}
		for(char c: s.toCharArray()) {
			if(freqMap.get(c) == 1) {
				return c;
			}
		}
		return null;
	}

	/**
	* Returns true if the given two integers are anagrams.
	* Anagrams are the words formed by rearranging the letters of another word.
	*/
	public static boolean areAnagrams(int num1, int num2) {
		char[] arr1 = Integer.toString(num1).toCharArray();
		char[] arr2 = Integer.toString(num2).toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		return Arrays.equals(arr1, arr2);
	}

	//Main function to test the above methods
	public static void main(String[] args) {
		Map<Integer, String> mapObj = new HashMap<Integer, String>();
		mapObj.put(1, "One");
		mapObj.put(2, "Two");
		mapObj.put(3, "Three");
		System.out.println(mapObj);
		remove(mapObj, 2);
		System.out.println(mapObj);
		
		System.out.println(firstNonRepeatedChar("abaccdeff"));
		System.out.println(firstNonRepeatedChar("hello"));
		
		System.out.println(areAnagrams(12345, 54321));
		System.out.println(areAnagrams(123456, 654321));
	} 
}