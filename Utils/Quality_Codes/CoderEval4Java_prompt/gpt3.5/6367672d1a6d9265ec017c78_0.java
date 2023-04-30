import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class RandomizedSet{
	/** 
	 * Inserts a value to the set. Returns true if the set did not already contain the specified element. 
	 */
	
	public boolean insert(int val){
			// Declare a boolean variable to store if the value is successfully inserted or not
        boolean successfullyInserted = false;
        
        // Check if the value is already present in the set
        if(!map.containsKey(val)){  // map is a HashMap<Integer, Integer> instance variable of the class
            // If the value is not present, add it to the end of the ArrayList and the map
            list.add(val);
            map.put(val, list.size()-1);
            
            // Set the boolean variable to true to indicate successful insertion
            successfullyInserted = true;
        }
        
        return successfullyInserted;
	}
	/** Removes a value from the set. Returns true if the set contained the specified element. */
	public boolean remove(int val){
	     // Declare a boolean variable to store if the value is successfully removed or not
        boolean successfullyRemoved = false;
        
        // Check if the value is present in the set
        if(map.containsKey(val)){ 
            // If the value is present, get its index from the map
            int index = map.get(val);
            
            // Swap the value with the last value in the ArrayList
            int temp = list.get(list.size()-1);
            list.set(index, temp);
            map.put(temp, index);
            
            // Remove the value from the end of the ArrayList and the map
            list.remove(list.size()-1);
            map.remove(val);
            
            // Set the boolean variable to true to indicate successful removal
            successfullyRemoved = true;
        }
        
        return successfullyRemoved;
	}
	/** Get a random element from the set. */
	public int getRandom(){
	   // Generate a random index using the size of the ArrayList as the upper limit
        int randomIndex = (int)(Math.random() * list.size());
        
        // Return the value at the random index
        return list.get(randomIndex);
	}
	
	// ArrayList instance variable to store the values in the set
    List<Integer> list;
    
    // HashMap instance variable to store the indices of the values in the ArrayList
    Map<Integer, Integer> map;
    
    // Constructor to initialize the data structures
    public RandomizedSet(){
        list = new ArrayList<>();
        map = new HashMap<>();
    }
}
			