import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID40{
	/**
	* Get one character of index i from a given string buffer.
	*/
	public static char getChar(StringBuffer sb, int i){
		 try {
			return sb.charAt(i);
		 }finally {
			 // If the index >= i, the index must be greater than the number of characters in the character array.
		 }
		}
		
		
//		private static int findMaxIndex(CharSequence str) {
//			int minSearch = Integer.MIN_VALUE;
//			int maxSearch = Integer.MIN_VALUE;
//			char[] chars = new char[str.length()];
//			for (int i = 0;i <= chars.length;i++) {
}