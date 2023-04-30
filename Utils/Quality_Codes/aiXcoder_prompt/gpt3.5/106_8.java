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
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
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
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				array[i * width + j] = m[i][j];
			}
		}
		return array;
	}

	/**
	* 输出二维数组
	*/
	public static void printMatrix(int[][] m){
		for (int[] row : m) {
			System.out.println(Arrays.toString(row));
		}
	}

	/**
	* 输出一维数组
	*/
	public static void printArray(int[] m){
		System.out.println(Arrays.toString(m));
	}

	/**
	* 按行输出二维数组
	*/
	public static void printMatrixByRow(int[][] m){
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}

	/**
	* 按列输出二维数组
	*/
	public static void printMatrixByCol(int[][] m){
		for (int j = 0; j < m[0].length; j++) {
			for (int i = 0; i < m.length; i++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}

	/**
	* 根据笛卡尔坐标系输出二维数组
	*/
	public static void printMatrixByCoord(int[][] m){
}
}