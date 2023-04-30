import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class RandomizedSet{
	/** 
	 * Inserts a value to the set. Returns true if the set did not already contain the specified element. 
	 */
	
	public boolean insert(int val){
			// Create a HashMap to store the value and its index in a list
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		// If the value already exists in the set, return false
		if(map.containsKey(val)){
			return false;
		}
		
		// Get the size of the list and add the value to the end
		int size = list.size();
		list.add(val);
		
		// Put the value and its index in the map
		map.put(val,size);
		
		// Return true
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
		
		// Get the index of the value to remove
		int index = map.get(val);
		
		// Get the last value in the list
		int lastVal = list.get(list.size()-1);
		
		// Replace the value to remove with the last value in the list
		list.set(index,lastVal);
		
		// Update the index of the last value in the map
		map.put(lastVal,index);
		
		// Remove the last value from the list
		list.remove(list.size()-1);
		
		// Remove the value from the map
		map.remove(val);
		
		// Return true
		return true;
	}
	
	/** 
	 * Get a random element from the set.
	 */
	public int getRandom(){
		// Generate a random index within the size of the list
		Random rand = new Random();
		int index = rand.nextInt(list.size());
		
		// Return the value at the random index
		return list.get(index);
	}
	
	private List<Integer> list = new ArrayList<Integer>();
	private HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
}

