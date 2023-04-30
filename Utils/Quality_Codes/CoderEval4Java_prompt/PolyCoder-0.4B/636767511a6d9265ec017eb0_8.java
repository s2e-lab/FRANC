import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class CSRBooleanMatrix{
	/** 
	 * Get the number of non-zero entries of a row.
	 * @param row the row
	 * @return the number of non-zero entries of a row
	 */
	
	public int nonZeros(int row){
		 
			
					// find all the non zero entries of row and find the set of rows not in row[]
		    int rows = row.length;
		  	int n = 0;
	  
		  	int[] rowIndex = new int[rows]; 
	  	int cur = 0;
	  
		  	for(int col = 0; col < rows; col++){
		  		rowIndex[col] = row[col].intValue();
		  	}
	  
}
}