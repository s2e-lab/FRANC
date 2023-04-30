import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID94{
	/**
	* Choose a pseudo-random element from the specified array.
	*/
	public static int random(int[] array){
		 
	   if(array==null){
	 return array[random((int[])array.length)];
	  }
	  // make sure no duplicates appear
	  int i=0;
	  while((i<array.length) && array[i++]);
	  
	  return i;
	 
	 }
   // 
  
    // test 1
    int[] test1=new int[]{2, 3, 0, 5, -4, 1,-1, 3,2, 1, -3, 3};
}