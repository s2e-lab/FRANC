import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID46{
	/**
	* Element-by-element matrix multiplication in place, A = A*B 
	*/
	public void matrixMultiply(double[][] A, double[][] B){
		 for(int i = 0; i < A.length; i++){
			A[i][i] = A[i][i] * B[i][i];					
		}
	}

	/*
	 * method to calculate element-by-element orthogonal matrix 
	 *        in place
	 */

	/**
	* Calculate (a, b) = A*B
	*/
	void matrixMultiply(double[][] A, double[][] B){
		double sum = 0;
}
}