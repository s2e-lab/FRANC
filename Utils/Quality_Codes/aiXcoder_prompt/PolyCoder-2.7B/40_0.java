import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID40{
	/**
	* Get one character of index i from a given string buffer.
	*/
	public static char getChar(StringBuffer sb, int i){
		 int len = sb.length();
		 StringBuffer tmp = new StringBuffer();
		 for(int j = 0; j < len; j++){
			if(i == sb.charAt(j)){
				if(tmp.length() > j && sb.charAt(j) == '.') {
					return sb.charAt(j+1);
				}
				break;
			}
		}
		return tmp.charAt(0);
	}	String getID(StringBuffer sb){
		int i = 0;
}
}