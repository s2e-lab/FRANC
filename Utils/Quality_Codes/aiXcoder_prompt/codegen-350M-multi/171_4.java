import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID171{
	/**
	* 去掉浮点数多余的0
	*/
	public static String rvZeroAndDot(String s){
		String rs="";
		int index=0,i=s.indexOf('.');
		if (i!=-1)//浮点数开始
		{
			index=i;
			long number=Integer.valueOf(s.substring(0,index));
			rs=rs+s.substring(0,index)+"0";
		}
		Index_String num=new Index_String(s.toString());
		if(num.isEmpty()){
			return null;
		}
}
}