import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class RandomizedSet{
	/** 
	 * Inserts a value to the set. Returns true if the set did not already contain the specified element. 
	 */
	
	public boolean insert(int val){
			// Implementing the insertion logic using a HashMap and an ArrayList
		
		if(!map.containsKey(val)){ //checking if the value is already present in the set
			list.add(val); //adding a new element to the end of the ArrayList
			map.put(val, list.size()-1); //storing the position/index of the new element in the HashMap
			return true;
		}
		else{
			return false;
		}
	}

	/** 
	 * Removes a value from the set. Returns true if the set contained the specified element. 
	 */
	
	public boolean remove(int val){
		// Removing the element from the ArrayList and HashMap if it exists in the set
		
		if(map.containsKey(val)){ //checking if the value is present in the set
			int index = map.get(val); //getting the index of the element from the HashMap
			int lastVal = list.get(list.size()-1); //getting the last element value from the ArrayList
			
			//moving the last element to the index of the element to be removed
			list.set(index, lastVal);
			map.put(lastVal, index); //updating the index of the new element value in the HashMap
			
			list.remove(list.size()-1); //removing the last element from the ArrayList
			map.remove(val); //removing the element value from the HashMap
			return true;
		}
		else{
			return false;
		}
	}

	/** 
	 * Get a random element from the set. 
	 */
	
	public int getRandom(){
		// Generating a random index and returning the element value at that index
		Random rand = new Random();
		int index = rand.nextInt(list.size());
		return list.get(index);
	}
	
	// Private instance variables
	private List<Integer> list = new ArrayList<>();
    private Map<Integer,Integer> map = new HashMap<>();
}
