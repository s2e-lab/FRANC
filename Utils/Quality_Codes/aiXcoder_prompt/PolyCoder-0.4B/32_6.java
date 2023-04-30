import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID32{
	/**
	* Returns the minimum value in an array.
	*/
	public static int min(int[] array){
			return min(array,0,array.length-1);
	}

	public static int min(int[][] matrix, int minIndexX, int minIndexY){
		//Matrix.get(matrix,0,matrix.length-1,0,matrix.length-1);
		int count = size(matrix);
		assert(index(matrix[minIndexX], matrix[minIndexY], maxIndexX, maxIndexY)==0);
}
}