import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID106{
	/**
	* 一维数组转为二维数组
	*/
	public static int[][] arrayToMatrix(int[] m, int width, int height){
			if(m.length != width*height){
		throw new IllegalArgumentException("Invalid input array length");
	}

	int[][] matrix = new int[height][width];

	for(int i=0; i<height; i++){
		for(int j=0; j<width; j++){
			matrix[i][j] = m[i*width+j];
		}
	}

	return matrix;
}

/**
* 二维数组转为一维数组
*/
public static int[] matrixToArray(int[][] matrix){
	int height = matrix.length;
	int width = matrix[0].length;

	int[] m = new int[height*width];

	for(int i=0; i<height; i++){
		for(int j=0; j<width; j++){
			m[i*width+j] = matrix[i][j];
		}
	}

	return m;
}

/**
* 主函数
*/
public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);

	int n = scanner.nextInt();
	int[] a = new int[n];

	for(int i=0; i<n; i++){
		a[i] = scanner.nextInt();
	}

	// 将一维数组转为二维数组
	int[][] matrix = arrayToMatrix(a, (int)Math.sqrt(n), (int)Math.sqrt(n));

	// 对角线之和
	int sum1 = 0;
	for(int i=0; i<matrix.length; i++){
		sum1 += matrix[i][i];
	}

	int sum2 = 0;
	for(int i=0; i<matrix.length; i++){
		sum2 += matrix[i][matrix.length-1-i];
	}

	System.out.println(Math.abs(sum1 - sum2));
}
}