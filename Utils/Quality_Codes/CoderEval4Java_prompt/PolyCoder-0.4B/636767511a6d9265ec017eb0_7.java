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
		 int nz = 0;
		 for(int i = 0; i < row; i++){
	        if(this.element(row).nonzeros()){
	            nz++;
			 }
	        }
		 return nz;
	}
	
	
	public void print(PrintWriter writer, String str){
		if(str == null || str.equals("") || str.equals(""))
			return;
		
		// print columns.	
}
}