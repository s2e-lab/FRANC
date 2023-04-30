import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID94{
	/**
	* Choose a pseudo-random element from the specified array.
	*/
	public static int random(int[] array){
			Random rand = new Random();
		return array[rand.nextInt(array.length)];
	}
	
	/**
	* Main function to test the random function.
	* Generates an array of integers and chooses a random element from it.
	*/
	public static void main (String[] args) throws java.lang.Exception{
		int[] array = {1,2,3,4,5,6,7,8,9};
		int randomElement = random(array);
		System.out.println(randomElement);
	}
}