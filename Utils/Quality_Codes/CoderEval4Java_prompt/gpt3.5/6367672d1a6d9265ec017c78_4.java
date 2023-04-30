import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class RandomizedSet{
	/** 
	 * Inserts a value to the set. Returns true if the set did not already contain the specified element. 
	 */
	
	public boolean insert(int val){
			// Implementing insert() method using a hashmap and arraylist

		// Check if the value is already present in the set
		if (map.containsKey(val)) {
			return false;
		}
		
		// If value is not present, insert it at the end of the arraylist and update the hashmap
		list.add(val);
		map.put(val, list.size() - 1);
		return true;
	}
	
	/** 
	 * Removes a value from the set. Returns true if the set contained the specified element. 
	 */
	
	public boolean remove(int val){
		// Check if the value is present in the set
		if (!map.containsKey(val)) {
			return false;
		}
		
		// Swap the value to be removed with the last value in the arraylist, update the hashmap and remove the last element
		int indexToRemove = map.get(val);
		int lastVal = list.get(list.size() - 1);
		list.set(indexToRemove, lastVal);
		map.put(lastVal, indexToRemove);
		list.remove(list.size() - 1);
		map.remove(val);
		return true;
	}
	
	/** 
	 * Get a random element from the set.
	 */
	
	public int getRandom(){
		// Generate a random index and return the element at that index in the arraylist
		Random rand = new Random();
		return list.get(rand.nextInt(list.size()));
	}
	
	// Data structures required for the Randomized Set
	private ArrayList<Integer> list;
	private HashMap<Integer, Integer> map;
	
	// Constructor to initialize the data structures
	public RandomizedSet() {
		list = new ArrayList<>();
		map = new HashMap<>();
	}
}
