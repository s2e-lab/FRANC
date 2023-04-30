import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class TextFormat{
	/** 
	 * Is this a hex digit?
	 */
	
	private static boolean isHex(final char c){
		switch(c){
			case '0': return true;
			case '1': return true;
			case '2': return true;
			case '3': return true;
			case '4': return true;
			case '5': return true;
			case '6': return true;
			case '7': return true;
			case '8': return true;
			case '9': return true;
			case 'A': return true;
			case 'B': return true;
			case 'C': return true;
			case 'D': return