import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID48{
	/**
	* Adds all of the elements in collection to the Set.
	*/
	public static void addAll(Set<Integer> set, Collection<Integer> collection){
			for(Integer i : collection){
			set.add(i);
		}
	}
	
	/**
	* Returns the sum of all the elements in the Set.
	*/
	public static int sumSet(Set<Integer> set){
		int sum = 0;
		for(Integer i : set){
			sum += i;
		}
		return sum;
	}
	
	
	public static void main(String[] args){
		Set<Integer> set = new HashSet<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(5);
		list.add(1);
		list.add(3);
		list.add(7);
		list.add(9);
		
		addAll(set, list);
		
		System.out.println("Sum of the set: " + sumSet(set));
	}
}