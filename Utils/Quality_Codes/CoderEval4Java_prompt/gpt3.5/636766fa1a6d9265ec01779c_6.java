import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ParameterParser{
	/** 
	 * Parses out a token until any of the given terminators is encountered.
	 * @param terminators the array of terminating characters. Any of these characters when encountered signify the end of the token
	 * @return the token
	 */
	
	private String parseToken(final char[] terminators){
			Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		boolean finished = false;
		while(sc.hasNext() && !finished){
			char c = sc.next().charAt(0);
			for(char t : terminators){
				if(c == t){
					finished = true;
					break;
				}
			}
			if(!finished){
				sb.append(c);
			}
		}
		return sb.toString();
	}
}
