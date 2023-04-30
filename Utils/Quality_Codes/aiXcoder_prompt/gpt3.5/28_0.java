import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID28{
	/**
	* Split the given sequence with the given delimiter and return list of values.
	*/
	public static java.util.List<String> split(String sequence, String delimiter){
			StringTokenizer tokenizer = new StringTokenizer(sequence, delimiter);
			List<String> result = new ArrayList<String>();
			while(tokenizer.hasMoreTokens()){
				result.add(tokenizer.nextToken());
			}
			return result;
		}

	/**
	* Main method to calculate the sum of the diagonals in a spiral matrix of the given size.
	*/
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter matrix size: ");
		int n = sc.nextInt();
		if(n % 2 == 0){
			// If the matrix size is even, we can't form a spiral.
			System.out.println("Matrix size should be odd");
			return;
		}
		// Initialize the matrix with 0's of the given size.
		int[][] mat = new int[n][n];
		// Initialize the starting values of row and column.
		int row = n/2, col = n/2;
		// Initialize the current value as 1.
		int current = 1;
		// Initialize the layer number as 1.
		int layer = 1;
		// Iterate through all the layers of the matrix
		while(layer <= (n-1)/2){
			// Move right and update the matrix value
			for(int i=1; i<=2*layer; i++){
				col++;
				mat[row][col] = current++;
			}
			// Move down and update the matrix value
			for(int i=1; i<=2*layer; i++){
				row++;
				mat[row][col] = current++;
			}
			// Move left and update the matrix value
			for(int i=1; i<=2*layer; i++){
				col--;
				mat[row][col] = current++;
			}
			// Move up and update the matrix value
			for(int i=1; i<=2*layer; i++){
				row--;
				mat[row][col] = current++;
			}
			// Increment the layer number.
			layer++;
		}
		// Calculate the sum of the diagonals.
		int sum = 0;
		for(int i=0; i<n; i++){
			sum += mat[i][i] + mat[i][n-i-1];
		}

		// Print the matrix and the sum of the diagonals.
		System.out.println("Matrix:");
}
}