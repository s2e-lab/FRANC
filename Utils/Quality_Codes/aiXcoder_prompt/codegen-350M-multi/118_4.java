import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID118{
	/**
	* 返回不小于输入值value的最小整数
	*/
	public static int floor(double val){
		if(val==0){
			return 0;
		}
		return (int)val;
	}
	
	public static int get(int value){
		return value;	
	}
	
	public static void main(String args[]){
		int nv = 1;
		System.out.println(floor(nv));
	}
}
