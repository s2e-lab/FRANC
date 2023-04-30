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
	* 求矩阵转置
	*/
	public static int[][] transposeMatrix(int[][] matrix){
		int height = matrix.length;
		int width = matrix[0].length;
		int[][] result = new int[width][height];
		for(int i=0; i<width; i++){
			for(int j=0; j<height; j++){
				result[i][j] = matrix[j][i];
			}
		}
		return result;
	}

	/**
	* 输出矩阵
	*/
	public static void outputMatrix(int[][] matrix){
		for(int i=0; i<matrix.length; i++){
			for(int j=0; j<matrix[0].length; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] input = new int[n*n];
        for(int i=0; i<n*n; i++){
            input[i] = scanner.nextInt();
        }
        int[][] matrix = arrayToMatrix(input, n, n); // 将输入数据转化为矩阵
        int[][] transposedMatrix = transposeMatrix(matrix); // 计算矩阵的转置
        outputMatrix(transposedMatrix); // 输出矩阵的转置
    }
}