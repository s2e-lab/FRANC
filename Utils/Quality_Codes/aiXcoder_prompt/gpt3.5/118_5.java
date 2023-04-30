import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID118{
	/**
	* 返回不小于输入值value的最小整数
	*/
	public static int floor(double val){
			return (int)Math.ceil(val-1);
}

	public static void main (String[] args) throws java.lang.Exception{
		Scanner sc = new Scanner(System.in);
		double val = sc.nextDouble();
		System.out.println(floor(val));
	}
}