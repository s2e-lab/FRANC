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
			// TODO: Implement the method to count the number of non-zero entries in the given row of the matrix
			
	}
	
	/**
	 * Get the value of the element in the given position. 
	 * @param row the row of the requested element
	 * @param col the column of the requested element
	 * @return the value of the element in the given position
	 */
	
	public boolean getValue(int row, int col){
		// TODO: Implement the method to get the value of the element in the given position of the matrix
	}
	
	/**
	 * Set the value of the element in the given position.
	 * @param row the row of the element
	 * @param col the column of the element
	 * @param value the value to be set
	 */
	
	public void setValue(int row, int col, boolean value){
		// TODO: Implement the method to set the value of the element in the given position of the matrix
	}
	
	/**
	 * Get the number of rows of the matrix
	 * @return the number of rows of the matrix
	 */
	
	public int numRows(){
		// TODO: Implement the method to get the number of rows of the matrix
	}
	
	/**
	 * Get the number of columns of the matrix
	 * @return the number of columns of the matrix
	 */
	
	public int numCols(){
		// TODO: Implement the method to get the number of columns of the matrix
	}
	
	/**
	 * Multiply the matrix by a vector.
	 * @param v the vector to multiply
	 * @return the resulting vector
	 */
	
	public boolean[] multiply(boolean[] v){
		// TODO: Implement the method to multiply the matrix by a vector
	}
}