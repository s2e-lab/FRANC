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
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n*n];
		for(int i=0; i<n*n; i++){
			a[i] = sc.nextInt();
		}
		
		int[][] matrix = arrayToMatrix(a, n, n);
		
		// 进行计算
		// 先处理行
		for(int i=0; i<n; i++){
			int sumRow = 0;
			for(int j=0; j<n; j++){
				sumRow += matrix[i][j];
			}
			for(int j=0; j<n; j++){
				matrix[i][j] += (sumRow - matrix[i][j]);
			}
		}
		
		// 再处理列
		for(int j=0; j<n; j++){
			int sumCol = 0;
			for(int i=0; i<n; i++){
				sumCol += matrix[i][j];
			}
			for(int i=0; i<n; i++){
				matrix[i][j] += (sumCol - matrix[i][j]);
			}
		}
		
		// 转为一维数组输出
		int[] result = matrixToArray(matrix);
		for(int i=0; i<n*n; i++){
			System.out.print(result[i] + " ");
		}
		System.out.println();
	}
}