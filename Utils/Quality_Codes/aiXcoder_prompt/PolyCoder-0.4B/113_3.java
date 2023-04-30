import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID113{
	/**
	* This function takes an array of words, and returns a string with all the words in the separated by a space.
	*/
	public static String getStringfromStringArray(String[] array){
			String s="";
			for(int i=0;i<array.length;i++){
				s+=array[i];
			}
			return s;
	}
	public static String getLongStringfromString(String string){
		if(string==null || string.length()==0) return "";
		StringBuilder temp = new StringBuilder();
		textOf(string,"","","");
}
}