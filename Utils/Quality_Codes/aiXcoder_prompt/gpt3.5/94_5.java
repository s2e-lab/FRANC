import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID94{
	/**
	* Choose a pseudo-random element from the specified array.
	*/
	public static int random(int[] array){
			Random random = new Random();
		int index = random.nextInt(array.length);
		return array[index];
	}
	
	public static void main(String[] args){
		int[] numbers = {1, 2, 3, 4, 5};
		System.out.println("Random number: " + random(numbers));
	}
}