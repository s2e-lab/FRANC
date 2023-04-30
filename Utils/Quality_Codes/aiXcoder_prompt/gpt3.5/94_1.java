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
		int index = rand.nextInt(array.length);
		return array[index];
	}
	
	public static void main(String[] args){
		int[] numbers = {1,2,3,4,5,6,7,8,9};
		System.out.println("Random number: " + random(numbers));
	}
}