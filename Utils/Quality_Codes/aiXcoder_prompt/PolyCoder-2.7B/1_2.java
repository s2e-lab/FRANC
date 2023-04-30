import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID1{
	/**
	* Creates a padding string of a certain length
	*/
	public static String createPadding(int length, char padChar){
		 int i;
		 String padChars = "";
		 for(i = 0; i < length; ++i){
			 padChars += padChar;
		 }
		 return(padChars);
	}
	
	public static int length(String str)
	{
		int l,i = 0,j = 1;
		/*length from start to end*/
		while(itl(str.toCharArray(), i, j-1)){
			++i;
			j = i+1;
		}
}
}