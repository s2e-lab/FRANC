import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID46{
	/**
	* Element-by-element matrix multiplication in place, A = A*B 
	*/
	public void matrixMultiply(double[][] A, double[][] B){
		 
		 // Multiply and accumulate the elements
		 final long maxRows = A.length;
		 final long maxCols = B.length;
		 final long[][] matrix = new long[][] { { 0, maxRows, maxCols } };
			
		 final double[] Aarray = A[0];
		 final double[] Barray = B[0];
		 
}
}