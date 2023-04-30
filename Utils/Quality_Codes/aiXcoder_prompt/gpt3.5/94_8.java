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
}