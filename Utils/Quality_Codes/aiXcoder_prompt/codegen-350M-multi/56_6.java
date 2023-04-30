import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID56{
	/**
	* 判断是否只含字母
	*/
	public static boolean isLetter(char c){
		return isLetter(c-47);
	}
	
	public static boolean isLetter(byte c){
		return c<97 || c>122 || isLetter(c-48);
	}
	
	private static boolean isLetter(int c){
		if (c<97 || c>122){ return false;}
		else if ((c-48)<97 || (c-48)>122){ return true;}
		else return true;
	}
	
}