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
			// We need to count the number of non-zero entries of a given row.
// We can do this by iterating over the row and counting the non-zero entries

		int count = 0;

		for(int i = rowPtr[row]; i < rowPtr[row+1]; i++){
			if(values[i]) count++; // if the entry is non-zero, add to the count
		}

		return count;
	}
	
	/**
	 * Print the matrix as a string.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();

		// iterate over all rows and print them as tab-separated values
		for(int row = 0; row < numRows; row++){
			for(int i = rowPtr[row]; i < rowPtr[row+1]; i++){
				sb.append(values[i] ? "1" : "0"); // use 0/1 to represent Boolean values
				sb.append('\t');
			}
			sb.append('\n'); // add newline character at end of row
		}

		return sb.toString();
	}
	
	// Fields for the compressed sparse row (CSR) format
	private int numRows;
	private int numCols;
	private int numNonZeros;
	private int[] rowPtr; // stores the starting index of each row in the values array
	private int[] colIdx; // stores the column index of each non-zero entry
	private boolean[] values; // stores the value of each non-zero entry
}