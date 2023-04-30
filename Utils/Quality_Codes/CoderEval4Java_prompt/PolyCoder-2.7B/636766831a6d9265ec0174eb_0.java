import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class FileIterator{
	/** 
	 * Add the specified files in reverse order.
	 */
	
	private void addReverse(final File[] files){
			Iterator<File> iter = files.iterator();
			File tmp = null;
			
			while(iter.hasNext()){
				File f = iter.next();
				if(f.isFile()){
					fileMap.put(f.getAbsolutePath(), new File(f.getAbsolutePath()));
				}
				else{
					if (tmp!= null){
						fileMap.put(tmp.getAbsolutePath(), new File(tmp.getAbsolutePath()));
					}
					tmp = f;
				}
			}
			
	}

}