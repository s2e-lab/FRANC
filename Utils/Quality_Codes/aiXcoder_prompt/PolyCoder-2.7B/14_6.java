import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID14{
	/**
	* 用1到n随机初始化二维数组
	*/
	public static void init(int[][] arr, int n) {
			for(int i = 0; i < arr.length; i++){
				int[] tmp = new int[n];
				for(int j = 0; j < n; j++){
					if(!arr[i][j]){
						tmp[j]=0;
					}
				}
				arr[i] = tmp;
			}
		}

	public static void main(String[] args){
}
}