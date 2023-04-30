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
	* Returns a new map where the keys and values are swapped from the original map.
	*/
	public static Map<String, Integer> reverse(Map<Integer, String> mapObj){
		Map<String, Integer> reversedMap = new HashMap<String, Integer>();
		for(Map.Entry<Integer, String> entry : mapObj.entrySet()){
			reversedMap.put(entry.getValue(), entry.getKey());
		}
		return reversedMap;
	}

	/**
	* Returns a sorted list of the values in the map.
	*/
	public static List<String> sortValues(Map<Integer, String> mapObj){
		List<String> sortedList = new ArrayList<String>(mapObj.values());
		Collections.sort(sortedList);
		return sortedList;
	}

	/**
	* Computes the sum of the first n digits of the square of the given number.
	*/
	public static int computedSquareSum(int n){
		BigInteger num = BigInteger.valueOf(n);
		BigInteger square = num.multiply(num);
		String squareString = square.toString();
		int sum = 0;
		for(int i = 0; i < n; i++){
			sum += Character.getNumericValue(squareString.charAt(i));
		}
		return sum;
	}

	/**
	* Driver code to test the above methods.
	*/
	public static void main(String[] args){
		Map<Integer, String> testMap = new HashMap<Integer, String>();
		testMap.put(1, "one");
		testMap.put(2, "two");
		testMap.put(3, "three");
		testMap.put(4, "four");
		testMap.put(5, "five");

		System.out.println("Original Map: " + testMap);

		remove(testMap, 3);
		System.out.println("Map after removing key 3: " + testMap);

		Map<String, Integer> reversedMap = reverse(testMap);
		System.out.println("Reversed Map: " + reversedMap);

		List<String> sortedValues = sortValues(testMap);
		System.out.println("Sorted Values: " + sortedValues);

		int num = 5;
		int sum = computedSquareSum(num);
		System.out.println("Sum of the first " + num + " digits of the square of " + num + ": " + sum);
	}
}