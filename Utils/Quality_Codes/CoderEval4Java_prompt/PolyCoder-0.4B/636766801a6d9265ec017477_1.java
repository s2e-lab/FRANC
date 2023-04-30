import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class InputStreamIterator{
	/** 
	 * Add the specified files in reverse order.
	 */
	
	private void addReverse(final InputStream[] files){
			for(int i=files.length-1;i>=0;i--){
				if(files[i].isFile()){
					files[i] = files[files.length-1].getAsFile();
					files[files.length-1] = files[0].getAsFile();
				}else{
					files[i] = files[0].getAsFile();
					files[0] = files[i].getAsFile();
				}
			}
	}
	
}