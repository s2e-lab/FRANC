import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID113{
	/**
	* This function takes an array of words, and returns a string with all the words in the separated by a space.
	*/
	public static String getStringfromStringArray(String[] array){
			StringBuffer out=new StringBuffer();
			for (String word : array){
			    out.append(word+" ");
			}
			out.append('\n');
			return out.toString();
	}
	public static void main(String a[]){
		String[] array=new String[12];
		ID113 id = new ID113();
}
}