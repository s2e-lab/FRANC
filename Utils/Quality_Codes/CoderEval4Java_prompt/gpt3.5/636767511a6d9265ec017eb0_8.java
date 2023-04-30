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
			// Here is the code for the nonZeros method
		int numNonZeros = 0;
		for (int i = rowPtr[row]; i < rowPtr[row + 1]; i++){
			if (values[i] == true){
				numNonZeros++;
			}
		}
		return numNonZeros;
	}
}