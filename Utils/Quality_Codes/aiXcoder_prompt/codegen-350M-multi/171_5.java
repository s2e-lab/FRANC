import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID171{
	/**
	* 去掉浮点数多余的0
	*/
	public static String rvZeroAndDot(String s){
		int i;
		char ret ='';
		
		for (i = 0; i < s.length() && s.charAt(i) <= 0; i++)
			ret = s.charAt(i);
		
		if (ret == 10 || ret == 13 || ret == 27 || ret == 44) return null;
		/*
		while (ret == 10 || ret == 13 || ret == 27 || ret == 44){
			ret = read();
		}
		*/
}
}