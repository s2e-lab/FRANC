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
	* Returns a new map containing all the entries from the input map, but with keys and values swapped.
	*/
	public static Map<String, Integer> swapKeysAndValues(Map<Integer, String> mapObj){
		Map<String, Integer> swappedMap = new HashMap<String, Integer>();
		for(Map.Entry<Integer, String> entry : mapObj.entrySet()){
			swappedMap.put(entry.getValue(), entry.getKey());
		}
		return swappedMap;
	}
	
	/**
	* Returns true if the input string is a palindrome.
	*/
	public static boolean isPalindrome(String str){
		String reverse = new StringBuilder(str).reverse().toString();
		return reverse.equals(str);
	}

	/**
	* Returns true if the input integer contains only even digits.
	*/
	public static boolean containsOnlyEvenDigits(int num){
		String str = Integer.toString(num);
		for(int i=0; i<str.length(); i++){
			if(Character.getNumericValue(str.charAt(i)) % 2 != 0){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args){
		Map<Integer, String> testMap = new HashMap<Integer, String>();
		testMap.put(1, "One");
		testMap.put(2, "Two");
		testMap.put(3, "Three");
		
		remove(testMap, 2);
		
		Map<String, Integer> swappedMap = swapKeysAndValues(testMap);
		
		System.out.println(swappedMap);
		
		String palindrome = "racecar";
		System.out.println(isPalindrome(palindrome));
		
		int evenDigits = 2468;
		System.out.println(containsOnlyEvenDigits(evenDigits));
	}
}