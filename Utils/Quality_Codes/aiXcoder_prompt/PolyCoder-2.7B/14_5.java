import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID14{
	/**
	* 用1到n随机初始化二维数组
	*/
	public static void init(int[][] arr, int n) {
		 
		randomArray(arr); 
		for (int i = 0; i < n; i++) 
		{
			int start = rand() % arr[0].length, 
			end = rand() % arr[0].length;
			arr[i][0] = start;
			arr[i][1] = end;
		}
		
//		System.out.println(arr[0][0]<=arr[0][1]);//测试
	}
	
	
	
}