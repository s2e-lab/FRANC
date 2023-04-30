import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID46{
	/**
	* Element-by-element matrix multiplication in place, A = A*B 
	*/
	public void matrixMultiply(double[][] A, double[][] B){
		 Matrix3D_DMD<double> M = MatrixNDimension(B.length+A[0].length<double>); 
		int r = matrixMultiplyDMD(A,B,M);
		MatMul2D(B,M,M);
		if (r!= 1) throw new Error("MatrixMultiplyDMD failed");
	}
  
 
		 // DML 2.1 
  
    public  Matrix3D_DMD<double> matrixMultiplyDMD(double[][] A, double[][] B){
    		