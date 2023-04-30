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
			buf.append ("_");		
			 buf.append((nameStart+0x06)+1);
				/*	The first character is the name's decimal
							or dot.
							The last one:
								* '#'
								* '.'
								* '@'
								or '@'.*/
				
}
}