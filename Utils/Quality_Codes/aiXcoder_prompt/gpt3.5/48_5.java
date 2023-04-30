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

	public static void main(String[] args){

		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();

		// Adding elements to set1
		set1.add(1);
		set1.add(2);
		set1.add(3);

		// Adding elements to set2
		set2.add(3);
		set2.add(4);
		set2.add(5);

		// Creating a new set to store the intersection of set1 and set2
		Set<Integer> intersectionSet = new HashSet<>(set1);
		intersectionSet.retainAll(set2);

		// Creating a new set to store the union of set1 and set2
		Set<Integer> unionSet = new HashSet<>(set1);
		ID48.addAll(unionSet, set2);

		// Printing the intersection and union sets
		System.out.println("Intersection set: " + intersectionSet);
		System.out.println("Union set: " + unionSet);
	}
}