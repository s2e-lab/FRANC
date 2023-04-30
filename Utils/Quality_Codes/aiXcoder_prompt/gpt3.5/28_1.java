import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID28{
	/**
	* Split the given sequence with the given delimiter and return list of values.
	*/
	public static java.util.List<String> split(String sequence, String delimiter){
			StringTokenizer st = new StringTokenizer(sequence, delimiter);
		java.util.List<String> values = new java.util.ArrayList<String>();
		while (st.hasMoreTokens()) {
			values.add(st.nextToken());
		}
		return values;
	}
	
	/**
	* Calculate the sum of the diagonals of a given square matrix.
	*/
	public static int sumDiagonal(int[][] matrix){
		int sum = 0;
		int n = matrix.length;
		for (int i = 0; i < n; i++) {
			sum += matrix[i][i];
			sum += matrix[i][n-i-1];
		}
		return sum - 1; //The center element is counted twice, so subtract one
	}
	
	/**
	* Generate a square matrix of size n x n with the given sequence of numbers.
	* The sequence must have n*n elements.
	*/
	public static int[][] generateMatrix(String sequence, int n){
		java.util.List<String> values = split(sequence, " ");
		int[][] matrix = new int[n][n];
		int k = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = Integer.parseInt(values.get(k));
				k++;
			}
		}
		return matrix;
	}
	
	/**
	* Main method to read input and generate the output.
	*/
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String sequence = sc.nextLine().trim();
		int[][] matrix = generateMatrix(sequence, n);
		int sum = sumDiagonal(matrix);
		System.out.println(sum);
	}
}