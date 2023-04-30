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
		String temp = null;
		
		return  escape( input, "\"~'<>|&"); // Escape
	}
	
	/** 
	 * Unescape a string DOT label or ID.
	 * @param input the input
	 * @return the unescaped output
	 */
	
	private String unescapeLabel(String input){
		String temp = null;
		
		return  escape( input, "\"~'<>|&"); // Escape or just unescape
	}
	

	private boolean match(String input){

}
}