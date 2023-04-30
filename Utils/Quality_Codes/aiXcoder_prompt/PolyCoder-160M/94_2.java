import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID94{
	/**
	* Choose a pseudo-random element from the specified array.
	*/
	public static int random(int[] array){
			int i=0;
				
			while(i<array.length){
				if(array[i] == 0) break;
				i++;
			}
			int x=rand()*array[i];
			i=0;
			while(i<array.length)
				array[i]=x%array[i];
			x=rand()*array[i];
			i=0;
}
}