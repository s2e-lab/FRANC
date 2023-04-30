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
		int len = nameStart + 1;
		if (nameStart > 3 && Character.isLetter(nameStart)) {
			len = 3;
		}
			buf.append(nameStart);
		if (len >= buf.length())
			buf.append("[too long]");
	}
}