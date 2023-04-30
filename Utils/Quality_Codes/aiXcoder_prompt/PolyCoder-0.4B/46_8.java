import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID46{
	/**
	* Element-by-element matrix multiplication in place, A = A*B 
	*/
	public void matrixMultiply(double[][] A, double[][] B){
			//System.out.println("Matrix Multiplication");
			int rows00 = A[0].length,  rows01  = A[0].length/1,
						rows10  = A[0].length-1, cols00 = A[0][0].length,
						rows11  = A[0][0].length/1, cols11 = A[0][0].length-1;
			int cols00m1 = cols10*A[0][0].length, cols11m1 = A.length;
			//	
}
}