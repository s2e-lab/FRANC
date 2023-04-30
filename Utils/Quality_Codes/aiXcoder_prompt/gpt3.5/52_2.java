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
* Returns the concatenation of all String values in the map, sorted in ascending order of their length.
*/
	public static String concatAndSort(Map<Integer, String> mapObj){
		// Get a Collection of all the values in the Map
		Collection<String> values = mapObj.values();
		
		// Convert the Collection to an Array
		String[] strArr = values.toArray(new String[values.size()]);
		
		// Sort the Array in ascending order of length
		Arrays.sort(strArr, Comparator.comparing(String::length));
		
		// Concatenate the sorted String Array
		String result = String.join("", strArr);
		
		return result;
	}
	
	public static void main(String[] args){
		Map<Integer, String> mapObj = new HashMap<Integer, String>();
		
		// Adding elements to the Map
		mapObj.put(1, "Programming");
		mapObj.put(2, "is");
		mapObj.put(3, "fun");
		mapObj.put(4, "and");
		mapObj.put(5, "challenging");
		
		// Removing an element from the Map
		System.out.println("Before removal: " + mapObj);
		remove(mapObj, 3);
		System.out.println("After removal: " + mapObj);
		
		// Concatenating and Sorting all String values in the Map
		System.out.println("Concatenated and Sorted string: " + concatAndSort(mapObj));
	}
}