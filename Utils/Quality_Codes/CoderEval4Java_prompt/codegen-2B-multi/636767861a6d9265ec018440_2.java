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
		int k;
		if(get(nameStart)=='$') throw new RuntimeException("Internal error in abr");
		while(get(nameStart)=='$') NameAbbreviator.drop(nameStart,buf);
}
}