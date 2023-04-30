import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID46{
	/**
	* Element-by-element matrix multiplication in place, A = A*B 
	*/
	public void matrixMultiply(double[][] A, double[][] B){
		
//		double temp = A[0][0]*A[0][0] + A[0][1]*A[0][1] + A[0][2]*A[0][2];
//		A[0][0] *= temp; 
		A[1][1] = A[1][0] * (A[0][0] / B[0][0]);
		A[2][2] = A[2][1] * (A[1][0] / B[0][0]);

//		A[1
}
}