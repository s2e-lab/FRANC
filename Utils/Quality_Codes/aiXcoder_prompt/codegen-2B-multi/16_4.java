import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID16{
	/**
	* Get a hashCode for the real vector. All NaN values have the same hash code.
	*/
	public static int hashCode(double[] vector){
		int hash=1;
		for(int i=0;i<vector.length;i++){
			hash=hash*31+hash(vector[i]);
		}
		return hash;
	}
	public static int hashCode(double[][] matrix){
		int h=0;
		for(int i=0;i<matrix.length;i++)
			for(int j=0;j<i;j++)
				h=h*31+hash(matrix[i][j]);
		return h;
	}

}