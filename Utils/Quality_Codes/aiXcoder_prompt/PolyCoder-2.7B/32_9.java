import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID32{
	/**
	* Returns the minimum value in an array.
	*/
	public static int min(int[] array){
		 int minNum=array[0];
   	 for(int i=1;i<array.length;i++){
	   		if(array[i]<minNum)
	   			minNum=array[i];
   	 }
   	 return minNum;
  }
}