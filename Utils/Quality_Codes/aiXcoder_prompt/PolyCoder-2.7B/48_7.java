import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID48{
	/**
	* Adds all of the elements in collection to the Set.
	*/
	public static void addAll(Set<Integer> set, Collection<Integer> collection){
		 for (Integer i : collection){
		  set.add(i);
		  }
	}
	
	/**
	* Remove a "from" element from a collection of elements.
	*/
	public static void removeFrom(Set<Integer> set, Collection<Integer> collection, int toElement){
		Collections.reverse(collection);
	    set.remove(toElement);
	}
	
	/**
	* Add all of the elements in collection to the Set.
	*/
}