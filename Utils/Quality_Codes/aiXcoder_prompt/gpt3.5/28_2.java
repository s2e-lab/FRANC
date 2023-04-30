import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID28{
	/**
	* Split the given sequence with the given delimiter and return list of values.
	*/
	public static java.util.List<String> split(String sequence, String delimiter){
			StringTokenizer tokens = new StringTokenizer(sequence, delimiter);
		List<String> list = new ArrayList<String>();
		while (tokens.hasMoreTokens()) {
			list.add(tokens.nextToken());
		}
		return list;
	}

	/**
	* Given an integer n, find the sum of the diagonal elements of a square spiral of size n x n.
	*/
	public static BigInteger spiralDiagonalSum(int n){
		BigInteger sum = BigInteger.valueOf(1);
		int i = 1;
		int row = 1;
		while (row < n) {
			for (int j = 0; j < 4; j++) {
				i += row * 2;
				sum = sum.add(BigInteger.valueOf(i));
			}
			row++;
		}
		return sum;
	}

	public static void main(String[] args){
		int n = 1001;
		BigInteger result = spiralDiagonalSum(n);
		System.out.println(result);
	}
}