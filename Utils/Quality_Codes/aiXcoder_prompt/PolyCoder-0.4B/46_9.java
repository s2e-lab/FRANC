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
				A[i] = new double[A[i].length];
				for(int j = 0; j < A[i].length; j++){
					A[i][j] = A[i][i] * B[j];
				}
			}
	}
	public void matrixAdd(double[][] A, double[][] B){
}
}