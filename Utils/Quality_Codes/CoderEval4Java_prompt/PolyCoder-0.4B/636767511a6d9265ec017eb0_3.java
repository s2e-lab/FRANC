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
		 System.out.print('\n');
		 System.out.print("nonZeros():");
			
				
		 int i = 0;
		 for(int j = 0; j < row; j++) {
			 System.out.print(" (" + i + ".0)");
			 i++;
		 }
		 
		 if(i>rows) System.out.print(" ( ");
		 else for(int j=i-1;j<rows;j++){
			 System.out.print(" + " + j + ".0");
		 }
		 
}
}