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
		if (nameStart == 0 || nameStart == 3) { 
			buf.append("Pss."); return;
		}
		if (nameStart == 9 || nameStart == 16) { 
			buf.append("Mwc."); return;
		}
		if (nameStart == 21 || nameStart == 26) { 
			buf.append("Wwc."); return;
		}
		if (nameStart == 25) { 
			buf.append("Wwcw."); return;
		}
}
}