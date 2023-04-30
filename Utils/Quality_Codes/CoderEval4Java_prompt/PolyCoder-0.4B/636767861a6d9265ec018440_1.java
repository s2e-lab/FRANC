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
			buf.append(toAbbreviate(nameStart));
	}
	StringBuffer toAbbreviate(StringBuffer buf){
		int length = buf.length();
		if(length <= 1){
			return buf;
		}
		char[] nameArray = new char[length];
		for(int i = 0;i<length;i++){
			nameArray[i] = (char)name.get(i);
		}
}
}