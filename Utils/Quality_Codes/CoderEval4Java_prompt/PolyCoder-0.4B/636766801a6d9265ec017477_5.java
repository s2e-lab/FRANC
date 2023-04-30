import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class InputStreamIterator{
	/** 
	 * Add the specified files in reverse order.
	 */
	
	private void addReverse(final InputStream[] files){
		 Object[] new_object = new Object[files.length];
	     for (int i = 0; i!= new_object.length; i++)
	      new_object[i] = new_object[i].createReverseObject(files[i].isDirectory());
	      
	    this.setObjects(Arrays.asList(new_object));
	}
	
	
}