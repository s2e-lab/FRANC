import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID14{
	/**
	* 用1到n随机初始化二维数组
	*/
	public static void init(int[][] arr, int n) {
			int[] a = new int[n];
			for(int i = 0; i < n; i++) {
				  a[i] = 1;
				}
		   for(int i = 0; i < n; i++) {
		   		a[i] = arr[i][0];
		   		for(int j = 1; j < arr.length; j++) {
		   			a[i] = Math.max(a[i], arr[i][j]);
		   		}
			  }
}
}