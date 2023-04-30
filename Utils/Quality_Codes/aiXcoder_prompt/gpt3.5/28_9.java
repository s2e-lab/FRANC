import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID28{
	/**
	* Split the given sequence with the given delimiter and return list of values.
	*/
	public static java.util.List<String> split(String sequence, String delimiter){
			List<String> result = new ArrayList<String>();
		if(sequence == null || sequence.isEmpty()){
			return result;
		}
		if(delimiter == null || delimiter.isEmpty()){
			result.add(sequence);
			return result;
		}
		int index = 0;
		while(index < sequence.length()){
			int nextIndex = sequence.indexOf(delimiter, index);
			if(nextIndex == -1){
				nextIndex = sequence.length();
			}
			result.add(sequence.substring(index, nextIndex));
			index = nextIndex + delimiter.length();
		}
		return result;
	}

	/**
	* Calculate the sum of diagonal numbers in the given square matrix.
	*/
	public static int sumOfDiagonalNumbers(int[][] matrix){
		int sum = 0;
		int n = matrix.length;
		for(int i=0; i<n; i++){
			sum += matrix[i][i];
			sum += matrix[i][n-i-1];
		}
		sum -= matrix[n/2][n/2];
		return sum;
	}

	public static void main(String[] args) throws Exception{
		//Calculate the sum of diagonal numbers in a 1001x1001 spiral matrix
		int n = 1001;
		int[][] matrix = new int[n][n];
		int num = n * n;
		int layer = 0;
		int x = n/2;
		int y = n/2;
		matrix[x][y] = num;
		num--;
}
}