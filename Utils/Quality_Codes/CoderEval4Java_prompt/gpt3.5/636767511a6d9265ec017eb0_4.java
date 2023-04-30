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
			// Your code starts here
		// Assume the boolean matrix is stored in Compressed Sparse Row (CSR) format.
		// Let's say the start indices of the rows are stored in an array called 'rowPtr'
		// The indices of the non-zero elements of the matrix are stored in an array called 'colInd'
		// The non-zero values of the matrix are stored in an array called 'values'

		// The number of non-zero entries in the given row is equal to the difference between the start index of the next row and the start index of the current row.
		// For the last row, the number of non-zero entries is equal to the total number of non-zero entries in the matrix minus the start index of the last row.

		int nextRowStart = rowPtr[row+1];
		if (row == rowPtr.length - 1) {
			return colInd.length - rowPtr[row];
		}
		return nextRowStart - rowPtr[row];
// Your code ends here
	}
}