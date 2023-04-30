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
		return input.replace("\"", "");
	}
	
	/** 
	 * Import DIMap ID2Name 
	 * @param input the input
	 * @return the id2name
	 */
	
	public String importDIMapName(String input){
		String output=null;
		
		String name=unescapeId(input);
		
		int numIds=-1;
		
}
}