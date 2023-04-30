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
		return input.replaceAll("(\\\\:)?[0-9a-fA-F]{1,8}", "\\\\$1");
	}

	private String getType(Event event){
		//get information of the type
		String type    = "";
		boolean isNumber = false;
}
}