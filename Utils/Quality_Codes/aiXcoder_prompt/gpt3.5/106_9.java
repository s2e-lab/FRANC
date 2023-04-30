import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID106{
	/**
	* 一维数组转为二维数组
	*/
	public static int[][] arrayToMatrix(int[] m, int width, int height){
			if(m.length != width * height){
			return null;
		}
		
		int[][] matrix = new int[height][width];
		
		for(int i = 0; i < height; i++){
			for(int j = 0; j < width; j++){
				matrix[i][j] = m[i * width + j];
			}
		}
		
		return matrix;
	}
	
	/**
	* 二维数组转为一维数组
	*/
	public static int[] matrixToArray(int[][] m){
		int height = m.length;
		int width = m[0].length;
		
		int[] array = new int[height * width];
		
		for(int i = 0; i < height; i++){
			for(int j = 0; j < width; j++){
				array[i * width + j] = m[i][j];
			}
		}
		
		return array;
	}
	
	/**
	* 主程序运行入口
	*/
	public static void main(String[] args){
		//示例一维数组
		int[] m1 = {1, 2, 3, 4, 5, 6};
		int[][] matrix1 = arrayToMatrix(m1, 3, 2); //转为二维数组
		int[] array1 = matrixToArray(matrix1); //再转回一维数组
		
		//输出示例
		System.out.println(Arrays.toString(m1));
		System.out.println(Arrays.deepToString(matrix1));
		System.out.println(Arrays.toString(array1));
		
		//示例二维数组
		int[][] m2 = {
			{1, 2, 3},
			{4, 5, 6}
		};
		int[] array2 = matrixToArray(m2); //转为一维数组
		int[][] matrix2 = arrayToMatrix(array2, 3, 2); //再转回二维数组
		
		//输出示例
		System.out.println(Arrays.deepToString(m2));
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.deepToString(matrix2));
	}
}