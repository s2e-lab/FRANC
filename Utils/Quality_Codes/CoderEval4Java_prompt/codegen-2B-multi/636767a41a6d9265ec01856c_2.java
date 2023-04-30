import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class StringSerializer{
	/** 
	 * Computes the size of the utf8 string beginning at the specified  {@code index} with the specified {@code length}.
	 */
	
	public static int computeUTF8Size(final CharSequence str,final int index,final int len){
		int result=len-index;
		for(int i=index;i<len;i++){
			int ch=str.charAt(i);
			if(ch < 0x80){
				result++;
			}else if(ch < 0x800){
				result+=2;
			}else if(ch <= 0xFFFF){
				result+=3;
			}else{
				result+=4;
			}
		}
		return result;
	}
}