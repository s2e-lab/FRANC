import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class RandomizedSet{
	/** 
	 * Inserts a value to the set. Returns true if the set did not already contain the specified element. 
	 */
	
	public boolean insert(int val){
			//Implementing HashSet to store the elements and check if the element already exists in the set.

		if(integersSet.contains(val)){
			return false;
		}
		integersSet.add(val);
		return true;
	}
	
	/** Removes a value from the set. Returns true if the set contained the specified element. */ 
	
	public boolean remove(int val){
		if(integersSet.contains(val)){
			integersSet.remove(val);
			return true;
		}
		return false;
	}
	
	/** Get a random element from the set. */ 
	
	public int getRandom(){
		Random rand = new Random();
		int randomIndex = rand.nextInt(integersList.size());
		return integersList.get(randomIndex);
	}
	
	private List<Integer> integersList;
	private Set<Integer> integersSet;
	
	public RandomizedSet(){
		integersList = new ArrayList<Integer>();
		integersSet = new HashSet<Integer>();
	}
}


// Driver code to test the RandomizedSet
