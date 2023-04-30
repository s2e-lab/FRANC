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
		String output = "";
		int ix=0;
		
		// skip the leading quote
		while (ix<input.length() && input.charAt(ix)!='\\'){
			output += input.charAt(ix);
			ix++ ;
		}
	
		return output;
	}
	
	private String dotToNewline(String input){
		if (input.contains("_")){
			String output = input+"_";
		 	return output;
		} else { return input; } 
	
}
}