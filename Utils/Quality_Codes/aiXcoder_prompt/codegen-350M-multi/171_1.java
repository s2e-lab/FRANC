import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID171{
	/**
	* 去掉浮点数多余的0
	*/
	public static String rvZeroAndDot(String s){
		if (s.matches("\\d+")){
			String num = "";
			String temp = s.substring(0,s.length()-1);
			while(temp.length()>1){
				num = num + temp;
				s = s.substring(0,s.length()-temp.length());
			}
			return s+num;
		}else{
			return s;
		}
	}
}