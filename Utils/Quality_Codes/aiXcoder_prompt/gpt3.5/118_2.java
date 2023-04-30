import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID118{
	/**
	* 返回不小于输入值value的最小整数
	*/
	public static int floor(double val){
			return (int) Math.ceil(val); //使用Java中的Math.ceil()函数返回不小于输入值的最小整数，因为最后要输出的是上取整的结果，所以需要使用Math.ceil()函数。