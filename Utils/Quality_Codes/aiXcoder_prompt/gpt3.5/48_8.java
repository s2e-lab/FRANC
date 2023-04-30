import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID48{
	/**
	* Adds all of the elements in collection to the Set.
	*/
	public static void addAll(Set<Integer> set, Collection<Integer> collection){
			for (Integer element : collection) {
			set.add(element);
		}
	}

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();

		//Creating a List of Integer
		List<Integer> list = new ArrayList<>();

		//Adding elements to the list
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		// Adding all elements in the list to the set
		addAll(set, list);

		//Printing the Set
		System.out.println("Set: " + set);
	}
}