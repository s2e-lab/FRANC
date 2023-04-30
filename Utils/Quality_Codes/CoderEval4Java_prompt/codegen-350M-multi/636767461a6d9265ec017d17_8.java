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
		String out = input;
		
		int idx = 0;
		
		while(true)
		{
			idx = out.indexOf("\\%d", idx);
			if(idx < 0) break;
			
			int rnd = Integer.parseInt(out.substring(idx, idx+4),16);
			out = out.substring(0,idx) + String.valueOf(rnd);
		}
		
		return out;
	}
	
}