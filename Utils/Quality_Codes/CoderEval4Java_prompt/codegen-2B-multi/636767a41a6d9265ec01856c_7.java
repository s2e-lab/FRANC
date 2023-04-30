import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class StringSerializer{
	/** 
	 * Computes the size of the utf8 string beginning at the specified  {@code index} with the specified {@code length}.
	 */
	
	public static int computeUTF8Size(final CharSequence str,final int index,final int len){
		
		if(index >= str.length()){
			return -1;
		}
		
		return str.charAt(index) << 8 | len;
	}
	
    /**
     * Writes the utf8 string to the specified {@code file}. 
     */
    static void dumpToFile(String str, File file) throws IOException{


        DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
}
}