import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID94{
	/**
	* Choose a pseudo-random element from the specified array.
	*/
	public static int random(int[] array){
			java.util.Random rand = new java.util.Random();
			return ((array[0]*32)+array[1]*32)+(rand.nextInt(1024)==0?1:rand.nextInt(1024)+1);
	}

}