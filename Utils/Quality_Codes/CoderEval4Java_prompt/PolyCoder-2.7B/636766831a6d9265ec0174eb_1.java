import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class FileIterator{
	/** 
	 * Add the specified files in reverse order.
	 */
	
	private void addReverse(final File[] files){
		 for (int i=files.length-1;i>=0;i--){
			 if (files[i].isDirectory()){
				 addReverse(files[i].listFiles());
				 files[i].delete();
			 }
			 else if (files[i].isFile()){
				 files[i].delete();
			 }
	  }
	}
	/**
	  * Add the specified files in forward order.
	  */

	private void addForward(final File[] files){
}
}