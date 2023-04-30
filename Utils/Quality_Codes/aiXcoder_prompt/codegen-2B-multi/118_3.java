import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID118{
	/**
	* 返回不小于输入值value的最小整数
	*/
	public static int floor(double val){
		if(val<0.000001){
			return 0;
		}
		long longVal = Math.round(val);
		if(longVal==val){
			return (int)longVal;
		}else{
			
			long longSmallerVal = Math.round(val-1);
			if(longSmallerVal==longVal){
				return (int)longVal;
			}else 		
				return (int)longSmallerVal;    
		}
		
	}
	
}