import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID118{
	/**
	* 返回不小于输入值value的最小整数
	*/
	public static int floor(double val){
		return (int)(val-(long)val);
	}

	public static void main(String[] args){
		System.out.println(floor(3.25));
	}
}