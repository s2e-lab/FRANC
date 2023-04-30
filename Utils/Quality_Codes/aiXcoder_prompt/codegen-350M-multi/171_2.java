import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID171{
	/**
	* 去掉浮点数多余的0
	*/
	public static String rvZeroAndDot(String s){
		String sret = "";
		char[] cs = s.toCharArray();
		int n = cs.length;
		int i = 0;
		while(i < n){
			if(Character.isDigit(cs[i])){
				sret += "0";
			}else{
				sret += StringUtil.numberToDigits(cs[i],10);
			}
			i++;
		}
		return sret;
	}
	
}
