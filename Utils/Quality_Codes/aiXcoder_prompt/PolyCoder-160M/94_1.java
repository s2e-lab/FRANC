import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID94{
	/**
	* Choose a pseudo-random element from the specified array.
	*/
	public static int random(int[] array){
			int c;
			int i=0;
			while (i<array.length)
			{
				c=i+random(array);
				
				if (c >= array.length) return 0;
				++array[i];
				
				if (c>=random(i)) return random(i)-c+1;
			}
			return 0;
	}

	/**
	* Choose a pseudo-random element from the specified array.
	* @param array Array.
	*/
}