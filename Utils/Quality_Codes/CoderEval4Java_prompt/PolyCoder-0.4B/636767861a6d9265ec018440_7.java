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
			buf.delete(nameStart,nameStart+2);
			//System.out.println("abbreviate: "+nameStart+":"+buf.toString());
			buf.insert(nameStart+2,".");
	}
	
	/**
	 * Abbreviate name.
	 * @param name a string that contains the abbreviation.
	 */
	
	public static void abbreviateName(String name){
		final StringBuilder buf = new StringBuilder();
		final int bufEnd = name.length()+1;
}
}