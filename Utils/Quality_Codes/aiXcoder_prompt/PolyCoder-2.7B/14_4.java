import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID14{
	/**
	* 用1到n随机初始化二维数组
	*/
	public static void init(int[][] arr, int n) {
		 // 初始化临时数组  
		int no;
		for (size = 0; size <= arr.length; size++) {
		    // 移动数组  
		    no = size + random(arr[size].length) - 1;	    
		    arr[++no] = generate(n,arr[size].length);   
		}
	}

	/*生成数组,随机选栈 */
	public static int[] generate(int n, int k){
		// 通过种
}
}