import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID85{
	/**
	* If the string passed in is not blank or null and did not end with the trailing value, then appended the trailing value to it and return the result 
	*/
	public static String appendTrailing(String str, String trailing){
		if(str == null || str.trim().equals("") || trailing.equals("")){
			return "";
		}
		char[] chs=str.toCharArray();
		int index=chs.length-1;
		int val=trailing.toCharArray()[index];
		while(index>0){
			index--;
			char newchar=chs[index];
			val += (newchar!=' ')? newchar:'';
		}
		return new String(chs);
	}
    
}