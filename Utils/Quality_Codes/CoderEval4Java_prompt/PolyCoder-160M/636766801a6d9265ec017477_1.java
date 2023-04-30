import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class InputStreamIterator{
	/** 
	 * Add the specified files in reverse order.
	 */
	
	private void addReverse(final InputStream[] files){
		 for(File file: files){
			 try(FileOutputStream in=new FileOutputStream(file.getPath())){
				 int count=file.toFile().length();
				 while(count-->0 && file.canSeek()) file.skipBytes(count);
				 file.close();
			 }
		 }
	}

}