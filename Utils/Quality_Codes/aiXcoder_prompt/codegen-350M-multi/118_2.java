import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID118{
	/**
	* 返回不小于输入值value的最小整数
	*/
	public static int floor(double val){
		int n=0;
		if(val>0)
		   n = Math.round(val);
		return (int) val;
	}
	
	public static int ceiling(double val){
		int n=0;
		if(val>0)
		   n = Math.ceil(val);
		return (int) val;
	}
	
	public static int max(int a,int b){
		int res=a;
		if(b>=a)
		   res=b;
		return res;
}
}