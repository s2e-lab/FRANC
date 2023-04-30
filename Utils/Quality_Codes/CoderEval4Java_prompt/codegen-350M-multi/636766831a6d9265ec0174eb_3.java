import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class FileIterator{
	/** 
	 * Add the specified files in reverse order.
	 */
	
	private void addReverse(final File[] files){
		try {
			for(int i = files.length-1; i >= 0; i--)
				ArrayList<File> fileList = new ArrayList<File>();

			for(int j = 0; j < files.length; j++){
				fileList.add(files[j]);
				fileList.add(files[j].getParentFile());
            }

			for(int j = files.length-1; j >= 0; j--)
				files[files.length-1-j] = files[j];

			files[files