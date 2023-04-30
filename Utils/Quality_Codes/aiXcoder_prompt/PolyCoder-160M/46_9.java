import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID46{
	/**
	* Element-by-element matrix multiplication in place, A = A*B 
	*/
	public void matrixMultiply(double[][] A, double[][] B){
			int nn = A.length;
			int ldc = B.length;

			double[] A_data = new double[nn];
			double[] B_data = new double[nn];

			int l_lo = 0, l_hi = 0, i = 0, j = 0, k = 0;
			double[] resRitz = new double[ldc];
			int numRes = 0;
			int k_hi = 0;
}
}