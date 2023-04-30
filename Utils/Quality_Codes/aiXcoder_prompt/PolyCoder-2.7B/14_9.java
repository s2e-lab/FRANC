import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID14{
	/**
	* 用1到n随机初始化二维数组
	*/
	public static void init(int[][] arr, int n) {
			m = arr[n-1][0];
			k = arr[0][m];
			j = 1;
			while(j < n){
			m += j;
				j *= k;
			}
			i = arr[n-1][m+1];
			j = arr[n-1][m+2];
			j = 0;
			while(j < n){
			i += j;
				j *= k;
			}
}
}