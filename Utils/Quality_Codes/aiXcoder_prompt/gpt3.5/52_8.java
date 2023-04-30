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
	* Returns a sorted map in descending order based on the values of the input map.
	*/
	public static Map<Integer, String> sortMapDescending(Map<Integer, String> mapObj){
		List<Map.Entry<Integer, String>> entryList = new ArrayList<>(mapObj.entrySet());
		
		Collections.sort(entryList, new Comparator<Map.Entry<Integer, String>>(){

			@Override
			public int compare(Map.Entry<Integer, String> entry1, Map.Entry<Integer, String> entry2) {
				return entry2.getValue().compareTo(entry1.getValue());
			}
			
		});
		
		Map<Integer, String> sortedMap = new LinkedHashMap<>();
		
		for(Map.Entry<Integer, String> entry : entryList){
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		
		return sortedMap;
	}
	
	public static void main(String args[]){
		Map<Integer, String> mapObj = new HashMap<>();
		mapObj.put(1, "apple");
		mapObj.put(2, "banana");
		mapObj.put(3, "orange");
		
		System.out.println("Map before removing key 2: " + mapObj);
		
		remove(mapObj, 2);
		
		System.out.println("Map after removing key 2: " + mapObj);
		
		Map<Integer, String> sortedMap = sortMapDescending(mapObj);
		
		System.out.println("Sorted map in descending order: " + sortedMap);
	}
}