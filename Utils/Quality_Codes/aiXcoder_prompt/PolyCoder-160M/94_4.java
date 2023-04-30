import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID94{
	/**
	* Choose a pseudo-random element from the specified array.
	*/
	public static int random(int[] array){
		 
	   Arrays.fill(array,random());
		 
		 return random()*array.length;
	   
   }
   	@Override
    	 public String toString () {
    	      return "ID94 ["+random(array.length)+","+array[random(array.length)]+"]";
   
   	}
  	 
 
   private static void throwExceptions ( IOException e ) {
		System.out.println(e.getMessage());
}
}