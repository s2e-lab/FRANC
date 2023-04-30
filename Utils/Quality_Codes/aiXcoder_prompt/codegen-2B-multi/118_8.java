import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID118{
	/**
	* 返回不小于输入值value的最小整数
	*/
	public static int floor(double val){
		if (val==(int)val+0.0001)return (int)val;
		return (int)(val+0.999999999999999);
	}
	static int pow(int f, int k){
	  int pow = 1;
        for (int i=0;i<k;i++){
          pow = pow*f;
        }
	  return pow;
	}
	static final double pi=3.1415926;
	static int g1 (int n, int l, double fact[], int[] ans){
}
}