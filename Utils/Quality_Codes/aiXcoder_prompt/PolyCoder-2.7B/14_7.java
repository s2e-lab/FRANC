import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID14{
	/**
	* 用1到n随机初始化二维数组
	*/
	public static void init(int[][] arr, int n) {
			for(int i=0;i<arr.length;i++){
				for(int j=0;j<arr[i].length;j++){
					arr[i][j]=i+j;
				}
			}
	}
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		int[][] a = new int[n][n];
}
}