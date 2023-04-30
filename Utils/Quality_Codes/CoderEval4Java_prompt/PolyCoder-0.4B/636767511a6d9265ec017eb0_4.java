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
		 
		int start = row ;
		int end = row + row ;
		if((end-start) < 0) // no entries in this row
			return 0;
		
		int numNonZero = 1;
		
		for(int col = start; col < end; col++){
			numNonZero *= ( ( col < row )? 1 : -1) ;//,column(row).get(col) );
			numNonZero *= ( ( col == row )? 1 : -1);
		}
		
}
}