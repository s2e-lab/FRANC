import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class InputStreamIterator{
	/** 
	 * Add the specified files in reverse order.
	 */
	
	private void addReverse(final InputStream[] files){
			outputFiles.add(files);
	}
	
	private void loadNextItem(final InputStream file){
		if(logger.isTraceLevelEnabled()){
				println("Compiling: " + toString());
				outputFiles.add(file);
		}
		
		final FileInputStream fis = new FileInputStream(file);
		
		final InputStreamReader reader = new InputStreamReader(fis);
		int i = 0;
		InputStreamLineIterator iterator = new InputStreamLineIterator(reader);
		
}
}