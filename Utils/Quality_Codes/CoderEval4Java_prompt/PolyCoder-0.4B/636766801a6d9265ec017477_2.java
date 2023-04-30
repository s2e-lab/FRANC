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
				String key = (filenames[i])[0];
				String filestr = filenames[i];
				String typestr = 
								(String)( files[i].getClass() 
										.getName() 
										.substring(0,1) +
										"/$1");
				int endPos = key.length()-2;
				String newKey = filestr.substring(endPos);
				key = newKey + filestr.substring(0