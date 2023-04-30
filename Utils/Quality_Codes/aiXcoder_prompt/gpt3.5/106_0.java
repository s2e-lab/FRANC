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
	* 计算一个矩阵中每行和每列的和
	*/
	public static int[][] rowColSum(int[][] matrix){
		int row = matrix.length;
		int col = matrix[0].length;
		int[][] result = new int[row+1][col+1];
		
		//计算行和列的总和
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				result[i][j] = matrix[i][j];
				result[row][col] += matrix[i][j];
				result[i][col] += matrix[i][j];
			}
		}
		
		return result;
	}
	
	/**
	* 输出二维数组中所有元素的值
	*/
	public static void printMatrix(int[][] matrix){
		for(int i=0; i<matrix.length; i++){
			for(int j=0; j<matrix[0].length; j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//读取输入矩阵的宽度和高度
		String[] wh = br.readLine().split("\\s");
		int width = Integer.parseInt(wh[0]);
		int height = Integer.parseInt(wh[1]);
		
		//读取一维数组表示的矩阵
		int[] array = new int[width*height];
		for(int i=0; i<height; i++){
			String[] line = br.readLine().split("\\s");
			for(int j=0; j<width; j++){
				array[i*width+j] = Integer.parseInt(line[j]);
			}
		}
		
		//将一维数组转为二维数组
		int[][] matrix = arrayToMatrix(array, width, height);
		
		//计算每行和每列的和
}
}