import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID1{
	/**
	* Creates a padding string of a certain length
	*/
	public static String createPadding(int length, char padChar){
		String str='';
		for(int i=0; i<length; i++){
			str = str+padChar;
		}
		return str;
	}


	/**
	* Returns the padding characters in a string
	*/
	public static String getPadding(String str){
		Pattern p = Pattern.compile(Pattern.quote(str.trim().replaceAll("\\\\", "\\\\\\\\")));
		Matcher m = p.matcher(str);
		String padding = "";
}
}