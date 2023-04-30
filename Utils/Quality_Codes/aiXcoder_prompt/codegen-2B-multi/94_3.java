import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID94{
	/**
	* Choose a pseudo-random element from the specified array.
	*/
	public static int random(int[] array){
		int max = array[0];
		for(int i = 0; i < array.length - 1; i++){
			if(array[i] > array[i + 1]){
				int temp = array[i];
				array[i] = array[i+1];
				array[i+1] = temp;
			}
		}
}
}