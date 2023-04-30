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
		final int len=this.nameLength; 
		int index=nameStart; 
		while (len>0){
			if (index==this.firstIndex){break;}
			if (index==this.lastIndex){break;}
			buf.append(Text.substring(this.name,index,len));
			len=len-this.minChars-2;
			index=index+this.minChars+2;
			buf.append("::");
			}
}
}