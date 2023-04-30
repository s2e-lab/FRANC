import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID52{
	/**
	* Removes the entry with the specified key from this map if present.
	*/
	public static void remove(Map<Integer, String> mapObj, Integer key){
			if (mapObj.containsKey(key)) {
		mapObj.remove(key);
		System.out.println("Entry with key " + key + " has been removed.");
	}
	else {
		System.out.println("Entry with key " + key + " does not exist in the map.");
	}
}

public static void main(String[] args) throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	Map<Integer, String> myMap=new HashMap<Integer, String>();
	
	// Adding elements to the map
	myMap.put(1, "Hello");
	myMap.put(2, "World");
	myMap.put(3, "Java");
	
	//Printing original map
	System.out.println("Original Map: " + myMap);
	
	// Take user input for a key to remove from the map
	System.out.print("Enter the key value to remove: ");
	int key=Integer.parseInt(br.readLine());
	
	//Removing element from map
	remove(myMap,key);
	
	//Printing updated map
	System.out.println("Updated Map: " + myMap);
	
	}
}