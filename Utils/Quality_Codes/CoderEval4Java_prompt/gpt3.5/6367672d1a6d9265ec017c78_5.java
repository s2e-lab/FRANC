import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class RandomizedSet{
	/** 
	 * Inserts a value to the set. Returns true if the set did not already contain the specified element. 
	 */
	
	public boolean insert(int val){
			// use HashMap to keep track of the index of each value
// to achieve constant time O(1) for remove and getRandom operations
// use ArrayList to keep track of the values in the set
// maintain a size variable to keep track of the size of the set

		if(!map.containsKey(val)){
			list.add(val);
			map.put(val, list.size() - 1);
			size++;
			return true;
		}
		return false;
	}
	
	/** 
	 * Removes a value from the set. Returns true if the set contained the specified element. 
	 */
	public boolean remove(int val){
		if(map.containsKey(val)){
			// get the index of the value to be removed
			int index = map.get(val);
			// remove the value from the list
			// by replacing it with the last value
			// and removing the last value
			int last_val = list.get(list.size() - 1);
			list.set(index, last_val);
			list.remove(list.size() - 1);
			// update the index of the last value to be the index of the removed value
			map.put(last_val, index);
			map.remove(val);
			size--;
			return true;
		}
		return false;
	}
	
	/** 
	 * Get a random element from the set. 
	 */
	public int getRandom(){
		Random rand = new Random();
		int index = rand.nextInt(size);
		return list.get(index);
	}
	
	
	// instance variables
	private Map<Integer, Integer> map;
	private List<Integer> list;
	private int size;
	
	// constructor
	public RandomizedSet(){
		map = new HashMap<>();
		list = new ArrayList<>();
		size = 0;
	}
}