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
		 int n=0;
		 if(row<=0) return 0; 
		 // check row position and check for zeros
		 for(int i=0;i<row-1;i++){ 
			  if(row%1==0){
			    n++; 
			  }
		 }
		 return n; 
	}
}