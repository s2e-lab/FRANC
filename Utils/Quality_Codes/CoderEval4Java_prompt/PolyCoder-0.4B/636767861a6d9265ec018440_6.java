import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class NameAbbreviator$DropElementAbbreviator{
	/** 
	 * Abbreviate name.
	 * @param buf buffer to append abbreviation.
	 * @param nameStart start of name to abbreviate.
	 */
	
	public void abbreviate(final int nameStart,final StringBuffer buf){
			// Get the next abbreviation and process it
			final StringBuffer retval= new StringBuffer();
			
			// Get the first substring ending in a '/'. 
			final String fileName = new String(buf.toString().toCharArray(),
						Integer.valueOf(buf.toString().lastIndexOf('/', fileNameStart + 1)));
			final String fname = fileName;
			
			// Get the first entry
			final Entry entry= getFileEntryByFileName(fileName);
			
			if(entry==null){ return; }
			
			// Is it a name.
}
}