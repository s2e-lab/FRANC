import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID171{
	/**
	* 去掉浮点数多余的0
	*/
	public static String rvZeroAndDot(String s){
		s = s.replaceAll("0*(\\d+)(\\d*)?","$1$2");
		int i = Integer.parseInt(s);
		s = s.replaceAll("0*$", "");
		return s+"";
	}
}