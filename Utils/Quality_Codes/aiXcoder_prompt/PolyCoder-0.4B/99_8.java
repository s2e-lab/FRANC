import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID99{
	/**
	* Convert a boolean value into a string.
	*/
	public static String boolToString(boolean b){
			StringBuilder str = new StringBuilder(); //TODO
			
			if(b){
				str.append("true");
			}
			else{
				str.append("false");
			}
			
			return str.toString();
	}
	
	
	public static String numToString(int num){
		StringBuilder ret;
		ret = new StringBuilder();
		
		if( num == 0 ){
			ret.append("0");
		}
		else{
			ret.append(num);
		}
}
}