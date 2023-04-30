import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID171{
	/**
	* 去掉浮点数多余的0
	*/
	public static String rvZeroAndDot(String s){
		String returnString = "";
		StringTokenizer st = new StringTokenizer(s,".");
		while (st.hasMoreTokens()) {
			returnString += st.nextToken() + "";
		}
		return returnString;
	}
	
	public static void main(String[] args) throws IOException{
}
}