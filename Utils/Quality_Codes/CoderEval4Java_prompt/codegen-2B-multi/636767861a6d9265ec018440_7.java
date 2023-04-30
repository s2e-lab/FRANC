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
		switch(System.getProperty("os.name")){
			case "Linux":
			case "Mac OS X":
				buf.append("_");
				break;
			default:
				break;
		}
		int nameLen=buf.length();
		int i;
		for(i=nameStart;i<4;){
			buf.setCharAt(nameLen-1,'_');
			nameLen--;
			i++;
		}
}
}