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
		buf.setLength(0);
		String abbreviation = "";
		final int endOfName = nameStart + abbr.length();
		NameAbbreviator abbrev = new NameAbbreviator();
		for (int i = nameStart;i < endOfName;i++){
			if (i >= abbrev.minLength){
				abbreviation += abbr.charAt(random.nextInt(abbr.length()));
			}
			buf.append((char)i);
		}
}
}