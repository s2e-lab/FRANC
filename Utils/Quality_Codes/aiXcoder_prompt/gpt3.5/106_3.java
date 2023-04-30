import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID106{
	/**
	* 一维数组转为二维数组
	*/
	public static int[][] arrayToMatrix(int[] m, int width, int height){
			int[][] matrix = new int[height][width]; // initialize matrix
		int index = 0;
		// iterate over matrix and populate with values from 1D array
		for(int i = 0; i < height; i++){
			for(int j = 0; j < width; j++){
				matrix[i][j] = m[index];
				index++;
			}
		}
		return matrix;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // number of test cases
		
		// iterate over test cases
		while(n > 0){
			int rows = sc.nextInt();
			int cols = sc.nextInt();
			int[] array = new int[rows * cols]; // initialize 1D array
			
			// populate 1D array
			for(int i = 0; i < rows * cols; i++){
				array[i] = sc.nextInt();
			}
			
			// convert 1D array to 2D matrix
			int[][] matrix = arrayToMatrix(array, cols, rows);
			
			// print matrix in spiral order
			for(int i = 0; i < cols; i++){
				// print top row
				for(int j = i; j < cols - i; j++){
					System.out.print(matrix[i][j] + " ");
				}
				// print right column
				for(int j = i + 1; j < rows - i; j++){
					System.out.print(matrix[j][cols - i - 1] + " ");
				}
				// print bottom row
				for(int j = cols - i - 2; j >= i && rows - i - 1 != i; j--){
					System.out.print(matrix[rows - i - 1][j] + " ");
				}
				// print left column
				for(int j = rows - i - 2; j > i && cols - i - 1 != i; j--){
					System.out.print(matrix[j][i] + " ");
				}
			}
			System.out.println();
			n--;
		}
	}
}