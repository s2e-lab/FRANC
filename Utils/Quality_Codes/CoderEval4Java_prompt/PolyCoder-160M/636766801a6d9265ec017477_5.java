import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class InputStreamIterator{
	/** 
	 * Add the specified files in reverse order.
	 */
	
	private void addReverse(final InputStream[] files){
			int num = (int)files.length;
			for(int i=0;i<num;i++){
				try {
					FileInputStream.installInput(files[i]);
				}
				catch (IOException e) {
					// We got IOException in installInput, ignore.
					// All of that is wrong in some cases. 
				}
			}
	}
}