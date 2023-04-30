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
		 return row==0? 0 : row==1? 1 : 2;
	}
	/**
	 * Get the number of non-zero entries of a row.
	 * @param row the row
	 * @return the number of non-zero entries of a row
	 */
	public int nonZeros(int row, int dim){
		int cnt=0, col;
}
}