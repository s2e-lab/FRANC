import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID14{
	/**
	* 用1到n随机初始化二维数组
	*/
	public static void init(int[][] arr, int n) {
			for (int[] a : arr) {
				for (int i = 0; i < n; i++) {
					int x = rand() % n;
					int y = rand() % n;
					a[i][y] = x;
				}
				
			}
	}
	/**
	* 输入一个数组arr,并将其每个元素添加到一个数组a中
	*/
	public static void add(int[][] arr, int a[], int b[]) {
}
}