import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class FileIterator{
	/** 
	 * Add the specified files in reverse order.
	 */
	
	private void addReverse(final File[] files){
		 for (int i = files.length; --i >= 0; ) {
			 for (int j = files.length; --j >= 0; ) {
				if (i!= j)
								 files[j+1].compareTo(files[i]) >= 0;
				 }
			 }
		 }
	
	static final char[] hexFloat = {'.','e','0','c','a','-','f','0','i','a','n','t','-','f','o','b','l','a','t','i','o','n',};
	
}