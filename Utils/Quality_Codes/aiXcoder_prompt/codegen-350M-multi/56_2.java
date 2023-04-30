import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID56{
	/**
	* 判断是否只含字母
	*/
	public static boolean isLetter(char c){
		return Character.isLetter(c);
	}
	public static boolean isLetter(String name) {
		return isLetter(getName(name));
	}
	public static String getName(String n){

		int i=0;
		while(i<n.length()){
			char c=n.charAt(i);
			if(!Character.isLetter(c))
				break;
			i++;
		}
		String s=n.substring(0,i+1);
		return s;
	}
}