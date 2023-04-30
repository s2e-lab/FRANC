import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID106{
	/**
	* 一维数组转为二维数组
	*/
	public static int[][] arrayToMatrix(int[] m, int width, int height){
			int[][] matrix = new int[height][width];
		for (int i = 0; i < height; i++){
			for (int j = 0; j < width; j++){
				matrix[i][j] = m[i*width+j];
			}
		}
		return matrix;
	}

	/**
	* 求矩阵最大值
	*/
	public static int maxInMatrix(int[][] matrix){
		int max = matrix[0][0];
		for (int i = 0; i < matrix.length; i++){
			for (int j = 0; j < matrix[0].length; j++){
				if (matrix[i][j] > max){
					max = matrix[i][j];
				}
			}
		}
		return max;
	}

	/**
	* 求矩阵最小值
	*/
	public static int minInMatrix(int[][] matrix){
		int min = matrix[0][0];
		for (int i = 0; i < matrix.length; i++){
			for (int j = 0; j < matrix[0].length; j++){
				if (matrix[i][j] < min){
					min = matrix[i][j];
				}
			}
		}
		return min;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++){
			b[i] = sc.nextInt();
		}
		int[][] matrixA = arrayToMatrix(a, n/2, 2);
		int[][] matrixB = arrayToMatrix(b, 2, n/2);
		int[][] matrixC = new int[n/2][n/2];
		for (int i = 0; i < n/2; i++){
			for (int j = 0; j < n/2; j++){
				for (int k = 0; k < 2; k++){
					matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
				}
			}
		}
}
}