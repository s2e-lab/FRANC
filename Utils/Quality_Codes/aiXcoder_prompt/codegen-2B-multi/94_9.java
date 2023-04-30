import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID94{
	/**
	* Choose a pseudo-random element from the specified array.
	*/
	public static int random(int[] array){
		if(array == null || array.length == 0)
			return 0;
		return array[(int)(Math.random()*10000)%array.length];
	}
	
	
	
	int[] a;
	int k;
	int m;
	int n;
	int[][] x;
	int[] y;
	
	public ID94 (int n, int m){
		this.n = n;
		this.m = m;
		a = new int[n+m];
		k = 0;
}
}