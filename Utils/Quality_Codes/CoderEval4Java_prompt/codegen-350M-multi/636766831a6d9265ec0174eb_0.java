import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class FileIterator{
	/** 
	 * Add the specified files in reverse order.
	 */
	
	private void addReverse(final File[] files){
		if(files!= null && files.length > 0) {
			String[] tmp = new String[files.length];
			int pos = 0;
			for(File file: files)
				tmp[pos++]=file.getCanonicalPath();
			Collections.reverse(Arrays.asList(tmp));
			Arrays.sort(Arrays.asList(tmp));
			for(String file: tmp)
				System.out.println(file);
		}
	}
	
}