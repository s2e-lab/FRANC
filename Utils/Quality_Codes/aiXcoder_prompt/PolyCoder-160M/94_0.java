import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID94{
	/**
	* Choose a pseudo-random element from the specified array.
	*/
	public static int random(int[] array){
		
//System.out.println("Random integer:"+array.length);
        int r=random();
        while(r!=Math.random())++r;
        return r;
    }
	
//  public static void main(String[] args){
//		
//      int[] array=new int[]{
//	          0,1,1,1,0,.4,-.5,1,2,    //
}