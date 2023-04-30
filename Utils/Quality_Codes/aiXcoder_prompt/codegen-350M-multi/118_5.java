import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID118{
	/**
	* 返回不小于输入值value的最小整数
	*/
	public static int floor(double val){
		val--;
		if (val < 0.0){
			return 0;
		} else if (val > 0.5){
			return 1;
		}else {
			return (int) val;
		}
	}

	public static void main(String[] args) throws Exception{
		String str="Hello: ".toCharArray();

		String str0 = null;

		double d1 = 1.0;
		double d2 = (2.0);
		double d3 =.5;
}
}