import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID183{
	/**
	* BigDecimal加法运算
	*/
	public static BigDecimal add(BigDecimal aVal, BigDecimal bVal){
			return aVal.add(bVal);
	}
	
	/**
	* BigDecimal减法运算
	*/
	public static BigDecimal subtract(BigDecimal aVal, BigDecimal bVal){
		return aVal.subtract(bVal);
	}
	
	/**
	* BigDecimal乘法运算
	*/
	public static BigDecimal multiply(BigDecimal aVal, BigDecimal bVal){
		return aVal.multiply(bVal);
	}
	
	/**
	* BigDecimal除法运算
	*/
	public static BigDecimal divide(BigDecimal aVal, BigDecimal bVal){
		return aVal.divide(bVal);
	}
	
	/**
	* BigDecimal幂运算
	*/
	public static BigDecimal pow(BigDecimal aVal, BigDecimal bVal){
		return aVal.pow(bVal.intValue());
	}
	
	/**
	* 根据ID编号生成对应的校验码
	*/
	public static String generateCheckCode(String id){
		
		//如果ID长度不为18位，则直接返回空字符串
		if(id.length() != 18){
			return "";
		}
		
		//截取ID号码最后一位作为性别标识：1代表男性，0代表女性
		String sex = String.valueOf(id.charAt(16));
		
		//获取ID号码前17位
		String id17 = id.substring(0, 17);
		
		//定义权值数组
		int[] weight = new int[]{7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
		
		//定义校验码数组
		String[] code = new String[]{"1", "0", "X", "9", "8", "7", "6", "5", "4", "3", "2"};
		
		//计算前17位号码加权后的乘积之和
		BigDecimal sum = new BigDecimal(0);
		for(int i = 0; i < 17; i++){
			BigDecimal val = new BigDecimal(String.valueOf(id17.charAt(i)));
			BigDecimal weightVal = new BigDecimal(weight[i]);
			sum = sum.add(val.multiply(weightVal));
		}
		
		//计算校验码索引值
}
}