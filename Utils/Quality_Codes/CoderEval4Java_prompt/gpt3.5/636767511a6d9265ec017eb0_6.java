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
			//TODO: Implement the nonZeros method
	}
	
	/** 
	 * Get the value of an element in the matrix.
	 * @param row the row index
	 * @param col the column index
	 * @return the value of the element in the matrix
	 */
	public boolean get(int row, int col){
		//TODO: Implement the get method
	}
	
	/** 
	 * Set the value of an element in the matrix.
	 * @param row the row index
	 * @param col the column index
	 * @param value the new value for the element in the matrix
	 */
	
	public void set(int row, int col, boolean value){
		//TODO: Implement the set method
	}
	
	/** 
	 * Perform a boolean matrix-vector multiplication.
	 * @param vector the vector to multiply by the matrix
	 * @return the resulting vector
	 */
	
	public boolean[] multiply(boolean[] vector){
		//TODO: Implement the multiply method
	}
	
	/** 
	 * Construct a new CSRBooleanMatrix object from a given boolean matrix.
	 * @param matrix the boolean matrix to represent in CSR format
	 */
	public CSRBooleanMatrix(boolean[][] matrix){
		//TODO: Implement the CSRBooleanMatrix constructor
	}
	
	/** 
	 * Construct a new CSRBooleanMatrix object from file with matrix in CSR format.
	 * @param filename the name of the file containing the matrix in CSR format
	 */
	
	public CSRBooleanMatrix(String filename){
		//TODO: Implement the CSRBooleanMatrix constructor
	}
}