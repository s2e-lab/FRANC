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
        while (st.hasMoreTokens()) {
            list.add(st.nextToken());
        }
        return list;
	}
	
	/**
	* Calculate the sum of the diagonals of a square matrix of the given order.
	* @param n Order of the matrix.
	* @return Sum of the diagonals.
	*/
	public static long diagonalSum(int n){
		long sum = 1; // Initialize with center element.
		int current = 1;
		for(int i=3; i<=n; i+=2){ // Only odd length matrices have diagonals.
			for(int j=0; j<4; j++){ // Add each diagonal of the current layer.
				current += (i-1);
				sum += current;
			}
		}
		return sum;
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		int n = Integer.parseInt(input.trim());
		// Calculate diagonal sum of n*n square matrix.
		long diagonalSum = diagonalSum(n);
		System.out.println(diagonalSum);
	}
}