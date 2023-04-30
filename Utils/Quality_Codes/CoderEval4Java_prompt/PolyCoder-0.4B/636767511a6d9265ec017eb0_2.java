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
			return (row % 2) == 0? row : row + 1;
	}
	
	/** 
	 * Get the number of non-ones entries of a row.
	 * @param row the row
	 * @return the number of non-ones entries of a row
	 */
	
	public int nonOneEntries(int row){
			int r = row % 2;
			if((row % 2) == 1){
				--r;
			}
			return r;
	}
}