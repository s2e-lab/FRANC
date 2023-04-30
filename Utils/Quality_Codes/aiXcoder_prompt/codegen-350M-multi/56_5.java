import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID56{
	/**
	* 判断是否只含字母
	*/
	public static boolean isLetter(char c){
		return (c>=48&&c<=57) || (c>=65&&c<=65+100);
	}
	
	/**
	* 将一个字符首字母暂时为字母
	*/
	public static char getLetter(char c){
		return (char)(c-48);
	}
	
	/**
	* 将一个字符加上字母
	*/
}