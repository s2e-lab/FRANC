import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID94{
	/**
	* Choose a pseudo-random element from the specified array.
	*/
	public static int random(int[] array){
		return array[Rand.rand.nextInt(array.length)];
	}

	/**
	* Generate a random number between 0 and Max - 1.
	*/
	public static int random(int Max){
		return Rand.rand.nextInt(Max) + 1;
	}

	public static double random(double Max){
		return Rand.rand.nextDouble() * Max;
	}

	/**
	* Modify an element in the specified input-output array (and return).
	*/
}