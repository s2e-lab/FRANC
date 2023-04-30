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
			switch (buf.charAt(nameStart)){
				case '\n':
				case '\r':
					buf.insert(nameStart+1, ".");
					break;
				case '\t':
				case '"':
					buf.insert(nameStart+1, "t.");
					break;
				case '$':
				case '@':
					buf.insert(nameStart+1, "&");
					break;
				case '"':
				case'':
				case '\t':
			