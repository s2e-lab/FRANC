import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class InputStreamIterator{
	/** 
	 * Add the specified files in reverse order.
	 */
	
	private void addReverse(final InputStream[] files){
		 try{
		for (int i=files.length-1; i>=0; i--){
			File file = files[i];
			for (int j=files[i].length-1; j>=0; j--){
			    file = new File(file,files[i][j].getAbsolutePath());
			}
		}
		}catch(Exception e){
			}

	}
 
    
	private void remove(final InputStream[] files) throws IOException{
}
}