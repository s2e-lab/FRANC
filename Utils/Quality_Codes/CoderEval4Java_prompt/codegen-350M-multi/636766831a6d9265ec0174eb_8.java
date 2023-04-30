import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class FileIterator{
	/** 
	 * Add the specified files in reverse order.
	 */
	
	private void addReverse(final File[] files){
		HashSet<String> set = new HashSet<String>();
		File[] files1 = new File(files[0].getAbsoluteFile());
		for(int i = 0; i < files1.length;i++){
			set.add(files1[i].getName());
		}		
}
}