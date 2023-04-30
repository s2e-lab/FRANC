import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID171{
	/**
	* 去掉浮点数多余的0
	*/
	public static String rvZeroAndDot(String s){
		int x =0;
		for (int i = 0;i < s.length();i ++){
			x *= 10;
			x += s.charAt(i) -'0';
		}
		return "" + x;
	}
	public static int rvNum(String s){
		int x =0;
		for (int i = 0;i < s.length();i ++){
			x *= 10;
			x += s.charAt(i) - '0';
		}
		return x;
	}
}