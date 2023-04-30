import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID94{
	/**
	* Choose a pseudo-random element from the specified array.
	*/
	public static int random(int[] array){
		int sum = 0;
		int i, r, k=array.length;
		int min=Math.min(k, array.length+k);
		for (i=0; i<k; i++) {
			sum+=array[i];
			if (sum>=min) return i;
		}
		return 0;
	}
	public static int[] generateN(int n){
		int[] num = new int[n];
		num[0]=1;
		int len = num.length;
}
}