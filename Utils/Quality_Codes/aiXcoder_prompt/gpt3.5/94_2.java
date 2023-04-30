import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID94{
	/**
	* Choose a pseudo-random element from the specified array.
	*/
	public static int random(int[] array){
			// Get a random index from the array
		int index = (int) (Math.random() * array.length);
		
		// Return the element at the random index
		return array[index];
	}

	public static void main(String[] args){
		// Initialize an array of integers
		int[] numbers = {2, 5, 1, 8, 9, 4};
		
		// Call the random method with the above array
		int randNum = random(numbers);
		
		// Print the randomly chosen number
		System.out.println("Randomly chosen number: " + randNum);
	}
}