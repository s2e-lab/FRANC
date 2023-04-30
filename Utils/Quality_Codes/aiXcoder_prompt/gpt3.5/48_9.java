import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID48{
	/**
	* Adds all of the elements in collection to the Set.
	*/
	public static void addAll(Set<Integer> set, Collection<Integer> collection){
			for (Integer elem : collection) {
		set.add(elem);
	}
}

/**
* Adds all of the elements in array to the Set.
*/
public static void addAll(Set<Integer> set, Integer[] array){
	for (Integer elem : array) {
		set.add(elem);
	}
}

/**
* Computes the sum of squares of all even integers in the Set.
*/
public static int sumOfSquaresOfEvenNumbers(Set<Integer> set){
	int sum = 0;
	for (Integer elem : set) {
		if (elem % 2 == 0) {
			sum += Math.pow(elem, 2);
		}
	}
	return sum;
}

public static void main(String[] args) {
	// create a Set and populate it with some elements
	Set<Integer> mySet = new HashSet<Integer>();
	Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	addAll(mySet, array);

	// compute and print the sum of squares of even integers in the Set
	int sum = sumOfSquaresOfEvenNumbers(mySet);
	System.out.println("Sum of squares of even numbers: " + sum);
}
}