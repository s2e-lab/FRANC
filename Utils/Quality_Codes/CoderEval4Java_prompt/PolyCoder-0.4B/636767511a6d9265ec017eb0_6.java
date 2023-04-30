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
		 int nnz = 0; // row.size();
		 for(int i = 0; i < row.size(); i++){
			 //if(i<row.size0()){ 
				nnz += row.getBoolean(i);
			//}
	}
		return nnz;
	}	// nonZeros
	
}