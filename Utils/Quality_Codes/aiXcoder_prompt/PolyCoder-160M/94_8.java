import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID94{
	/**
	* Choose a pseudo-random element from the specified array.
	*/
	public static int random(int[] array){
			Random r = new Random(System.nanoTime());
			return (int) r.nextInt(0, array.length-1);
	}
		
}