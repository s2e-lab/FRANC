import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID106{
	/**
	* 一维数组转为二维数组
	*/
	public static int[][] arrayToMatrix(int[] m, int width, int height){
			if (m.length != width * height) { // verify that the input array has the correct length
			System.out.println("Error: Invalid input array.");
			return null;
		}

		int[][] matrix = new int[height][width];

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				matrix[i][j] = m[i * width + j];
			}
		}

		return matrix;
	}

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);

		// read the input values
		int n = in.nextInt();
		int m = in.nextInt();
		int[] numbers = new int[n * m];
		for (int i = 0; i < n * m; i++) {
			numbers[i] = in.nextInt();
		}

		// convert the 1D array to a 2D matrix
		int[][] matrix = arrayToMatrix(numbers, m, n);

		// print the transpose of the matrix
		for (int j = 0; j < m; j++) {
			for (int i = 0; i < n; i++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}