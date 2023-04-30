import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class InputStreamIterator{
	/** 
	 * Add the specified files in reverse order.
	 */
	
	private void addReverse(final InputStream[] files){
			final int n = files.length;
			for(int i=0; i<n-1; i++) {
				for(int j=i+1;j<n; j++) {
					final InputStream input = files[i];
					if(input!=null) {
						files[i]=files[j];
						files[j]=input;}
					}
				}
			}
}