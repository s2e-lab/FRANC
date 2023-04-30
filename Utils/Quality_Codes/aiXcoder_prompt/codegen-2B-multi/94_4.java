import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID94{
	/**
	* Choose a pseudo-random element from the specified array.
	*/
	public static int random(int[] array){
		int left = 0;
		int right = array.length - 1;
		int midpoint;
		Random rand = new Random();
		
		while (left < right) {
			midpoint = left + (right - left)/2; 
			if (rand.nextBoolean())
				left = midpoint + 1;
			else
				right = midpoint;
		}
		
		return ((right + left)/2);
	}
	public static void test(){
		String input1 = "113333";
}
}