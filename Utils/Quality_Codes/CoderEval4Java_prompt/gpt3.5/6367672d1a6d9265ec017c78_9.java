import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class RandomizedSet{
	/** 
	 * Inserts a value to the set. Returns true if the set did not already contain the specified element. 
	 */
	
	public boolean insert(int val){
			// create a hashmap to store the value as key and index as value,
// and an ArrayList to store the actual value in order

    boolean flag = false;
    if(!map.containsKey(val)){
        list.add(val);
        map.put(val, list.size()-1);
        flag = true;
    }
    return flag;
}

	/** 
	 * Removes a value from the set. Returns true if the set contained the specified element. 
	 */
	
	public boolean remove(int val){
	    boolean flag = false;
        if(map.containsKey(val)){
            int index = map.get(val);
            int lastIndex = list.size() - 1;
            int lastVal = list.get(lastIndex);
            list.set(index, lastVal);
            list.remove(lastIndex);
            map.put(lastVal, index);
            map.remove(val);
            flag = true;
        }
        return flag;
}

	/** 
	 * Get a random element from the set. 
	 */
	
	public int getRandom(){
	    return list.get(rand.nextInt(list.size()));
	}

	// private members
	private HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	private ArrayList<Integer> list = new ArrayList<Integer>();
	private Random rand = new Random();
}