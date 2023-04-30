import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class RandomizedSet{
	/** 
	 * Inserts a value to the set. Returns true if the set did not already contain the specified element. 
	 */
	
	public boolean insert(int val){
			// Implementation of insert method using a HashMap and ArrayList

		// If the value already exists in the set, return false
		if(map.containsKey(val)){
			return false;
		}
		
		// If the value does not already exist in the set
		// Add it to the HashMap with its index in the ArrayList
		map.put(val, list.size());
		
		// Add the value to the end of the ArrayList
		list.add(val);
		
		// Return true since the set did not already contain the specified element
		return true;
	}

	/**
	 * Removes a value from the set. Returns true if the set contained the specified element. 
	 */
	public boolean remove(int val){
		// If the value does not exist in the set, return false
		if(!map.containsKey(val)){
			return false;
		}

		// Get the index of the value to be removed from the HashMap
		int index = map.get(val);
		
		// If the value to be removed is not the last one in the ArrayList
		if(index < list.size() - 1){
			// Replace the value at the index with the last value in the ArrayList
			int lastVal = list.get(list.size() - 1);
			list.set(index, lastVal);
			map.put(lastVal, index);
		}
		
		// Remove the value from the end of the ArrayList
		list.remove(list.size() - 1);
		
		// Remove the value from the HashMap
		map.remove(val);
		
		// Return true since the set contained the specified element
		return true;
	}

	/**
	 * Get a random element from the set.
	 */
	public int getRandom(){
		// Generate a random index within the size of the ArrayList
		Random rand = new Random();
		int index = rand.nextInt(list.size());
		
		// Return the value at the random index
		return list.get(index);
	}

	// HashMap to store the values and their indices in the ArrayList
	private Map<Integer, Integer> map;
	// ArrayList to store the values
	private List<Integer> list;
	
	// Constructor to initialize the HashMap and ArrayList
	public RandomizedSet(){
		map = new HashMap<>();
		list = new ArrayList<>();
	}
}