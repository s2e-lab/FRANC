import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class FileIterator{
	/** 
	 * Add the specified files in reverse order.
	 */
	
	private void addReverse(final File[] files){
		try{
	      
			for(int i=files.length-1;i>-1;i--){
				File temp = files[i];
				int i1 =  (i+1)%files.length;
				addReverse(files,i1,-1-i);
			}
	    }
		catch(FileNotFoundException ex){
			System.out.println(ex.getMessage());
		}
		catch(IOException ioe){
			System.out.println(ioe.getMessage());
		}

}
}