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
			java.util.List<String> list = new ArrayList<String>();
			while(st.hasMoreTokens()){
				list.add(st.nextToken());
			}
			return list;
	}

	/**
	* Return the sum of the diagonals of a square matrix.
	*/
	public static int getDiagonalSum(int[][] matrix){
		int sum = 0;
		int n = matrix[0].length;
		for(int i=0; i<n; i++){
			sum += matrix[i][i];
			sum += matrix[i][n-1-i];
		}
		sum -= matrix[n/2][n/2];
		return sum;
	}

	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);

		// Generate the matrix for given value of n.
		int[][] matrix = new int[n][n];
		int val = n*n;
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				matrix[i][j] = val--;
			}
		}

		// Get the sum of diagonals.
		int diagSum = getDiagonalSum(matrix);

		System.out.println(diagSum);
	}
}