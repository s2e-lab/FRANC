import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID56{
	/**
	* 判断是否只含字母
	*/
	public static boolean isLetter(char c){
		if(isLetter(c)){
			return true;
		}
		return false;

	}

	/**
	* 前置字符
	*/
	public static void printPrefix(){
		System.out.println("\n1-12345678-9AB");
	}

	/**
	* 后置字符
	*/
	public static void printPostfix(){
		System.out.println("1-12345678-A");
	}

}