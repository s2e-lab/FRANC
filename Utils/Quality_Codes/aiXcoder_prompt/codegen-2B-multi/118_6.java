import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID118{
	/**
	* 返回不小于输入值value的最小整数
	*/
	public static int floor(double val){
		Long l=Double.doubleToLongBits(val);
		int sign = l&0x8000000000000000;
		return (int)(l ^ (l>> 63)) ^ sign;
	}
}