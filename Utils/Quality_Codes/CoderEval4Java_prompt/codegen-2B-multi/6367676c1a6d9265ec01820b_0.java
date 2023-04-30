import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class Strings{
	/** 
	 * Delete any character in a given String.
	 * @param inString the original String
	 * @param charsToDelete a set of characters to delete.E.g. "az\n" will delete 'a's, 'z's and new lines.
	 * @return the resulting String
	 */
	
	public static String deleteAny(String inString,String charsToDelete){
		StringBuffer out = new StringBuffer();
		int pos = 0;
		while(true){
			int delPos = inString.indexOf(charsToDelete,pos);
			if (delPos==-1) break;
			out.append(inString.substring(pos,delPos));
			pos = delPos+1;
		}
		out.append(inString.substring(pos));
		return out.toString();
	}

	public static int[] findSubArray(int[] array, int[] subarray) {
	
}
}