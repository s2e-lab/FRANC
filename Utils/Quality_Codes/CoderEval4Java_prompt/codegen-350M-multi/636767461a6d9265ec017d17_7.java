import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class DOTEventDrivenImporter{
	/** 
	 * Unescape a string DOT identifier.
	 * @param input the input
	 * @return the unescaped output
	 */
	
	private String unescapeId(String input){
		StringBuffer output = new StringBuffer();
		int end = Math.min(input.length(), 1);
		int start = (input.length() == 1)?0:1;
		char first = input.charAt(0);
}
}