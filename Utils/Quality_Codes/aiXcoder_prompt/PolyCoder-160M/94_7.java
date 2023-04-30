import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID94{
	/**
	* Choose a pseudo-random element from the specified array.
	*/
	public static int random(int[] array){
		 int x = RANDOM.nextInt(array.length-1);
		 for(int i=0;i<array.length;i++){
			 if (array[i] < x){
      if (array[i] > x){
         return i;
      }
    }
      
   return x;
	}
		
}
}