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
		 // first element
		 final int start = nameStart;
		 final int len=Math.min(Integer.MAX_VALUE,start);
		 final String name = new String(buf,start,nameStart);
		 final char ch = firstLetterToLowerCase(name);
		 final char prevCh = 'A'+ch;
                                                        //
}
}