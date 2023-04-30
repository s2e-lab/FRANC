import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID118{
	/**
	* 返回不小于输入值value的最小整数
	*/
	public static int floor(double val){
		double double0=Math.floor(val);
		if((double0)<=val) return (int)double0;
		else return (int)val;
	}
	public static void main(String[] args){
		for(double i=6.25;floor(i)<=8;i*=2.5,System.out.println(floor(i)));
	}
}
