import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID118{
	/**
	* 返回不小于输入值value的最小整数
	*/
	public static int floor(double val){
			return (int)Math.ceil(val - 0.5);
	}

	/**
	* 求两个整数的最大公约数
	*/
	public static int gcd(int a, int b){
	    if(b == 0){
	        return a;
	    }
	    return gcd(b, a % b);
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            int m = in.nextInt();
            if(n == 0 && m == 0){
                break;
            }
            int k = (n - 1) / m;
            int sum = (2 * k + 1) * m * k / 2 + (n - m * k) * (k + 1);
            int gcd = gcd(sum, n);
            int numerator = sum / gcd;
            int denominator = n / gcd;
            System.out.println(numerator + "/" + denominator);
        }
    }
}