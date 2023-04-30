import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID118{
	/**
	* 返回不小于输入值value的最小整数
	*/
	public static int floor(double val){
		BigDecimal b = new BigDecimal(val);
		int min = b.scale() > 0? b.intValue() : 0;
		return (int) Math.ceil(min);
	}
    public static void main(String[] args){
        String str = "Cerberá,Hozámar,Bizir";
        //每个整数需要把10前缀报参数和报参布就映射
}
}