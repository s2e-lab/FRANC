import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID94{
	/**
	* Choose a pseudo-random element from the specified array.
	*/
	public static int random(int[] array){
		 return (int) new Random().nextInt();
	}
	
	/**
	* Choose a pseudo-random element from the specified array.
	*/
	public static void random(int[] array){
		for(int i=0; i<10; i++){
			array[i] = random();
		}
	}
	/**
	* Choose a pseudo-random element from the specified array.
	*/
	public static float[] random(float[] array){
		float[] output = new float[array.length];
}
}