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
			// TODO: Write code to implement the functionality of counting the number of non-zero entries of a row
	}
	
	/**
	 * Get the value at a specific row and column.
	 * @param row the row
	 * @param col the column
	 * @return the value at the specified row and column
	 */
	
	public boolean get(int row, int col){
		// TODO: Write code to implement the functionality of getting the value at a specific row and column
	}
	
	/**
	 * Set the value at a specific row and column.
	 * @param row the row
	 * @param col the column
	 * @param val the value to set
	 */
	
	public void set(int row, int col, boolean val){
		// TODO: Write code to implement the functionality of setting the value at a specific row and column
	}
	
	/**
	 * Multiply this matrix with another matrix.
	 * @param other the matrix to multiply with
	 * @return the result of the matrix multiplication
	 */
	
	public CSRBooleanMatrix multiply(CSRBooleanMatrix other){
		// TODO: Write code to implement the functionality of multiplying this matrix with another matrix
	}
	
	/**
	 * Transpose this matrix.
	 * @return the transpose of this matrix
	 */
	
	public CSRBooleanMatrix transpose(){
		// TODO: Write code to implement the functionality of transposing this matrix
	}
	
	/**
	 * Convert this matrix to a dense boolean matrix.
	 * @return the dense boolean matrix representation of this matrix
	 */
	
	public boolean[][] toDenseMatrix(){
		// TODO: Write code to implement the functionality of converting this matrix to a dense boolean matrix
	}
	
}