import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID88{
	/**
	* 将16进制字符串转10进制
	*/
	public static int hexStringToInt(String hexString){
			int intValue = Integer.parseInt(hexString, 16);
		return intValue;
	}

	/**
	* 计算两个数的最大公约数
	*/
	public static int gcd(int a, int b){
		if(b == 0){
			return a;
		}else{
			return gcd(b, a % b);
		}
	}

	/**
	* 计算两个数的最小公倍数
	*/
	public static int lcm(int a, int b){
		return (a * b) / gcd(a, b);
	}

	/**
	* 计算重量
	*/
	public static int calculateWeight(int a, int b){
		//计算公式：weight = (a + b) * (b - a + 1) / 2
		int sum = a + b;
		int difference = b - a + 1;
		int weight = (sum * difference) / 2;
		return weight;
	}

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] hexArray = new String[n];
		for(int i=0; i<n; i++){
			hexArray[i] = sc.next();
		}
		int minWeight = Integer.MAX_VALUE;
		for(int i=0; i<n; i++){
			for(int j=i+1; j<n; j++){
				int num1 = hexStringToInt(hexArray[i]);
				int num2 = hexStringToInt(hexArray[j]);
				int weight = calculateWeight(num1, num2);
				if(weight < minWeight){
					minWeight = weight;
				}
			}
		}
		System.out.println(minWeight);
	}
}