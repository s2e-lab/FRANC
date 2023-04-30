import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID118{
	/**
	* 返回不小于输入值value的最小整数
	*/
	public static int floor(double val){
			return (int)Math.ceil(val);
	}

	/**
	* 计算组合数
	*/
	public static BigInteger combination(int n, int k){
		BigInteger ans = BigInteger.ONE;
		for(int i=0;i<k;++i){
			ans = ans.multiply(BigInteger.valueOf(n-i));
			ans = ans.divide(BigInteger.valueOf(i+1));
		}
		return ans;
	}

	public static void main(String[] args){
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
			int n = cin.nextInt();
			double p = cin.nextDouble();
			double q = 1-p;
			double u = 1-p/q;
			double d = q/p;
			double R = Math.exp(n*Math.log(u));
			double S = R*Math.pow(d, n);
			double ans = 0;
			for(int i=0;i<=n;++i){
				double pi = Math.pow(u, n-i)*Math.pow(d, i);
				BigInteger num = combination(n, i);
				double C = num.doubleValue()*Math.pow(p, n-i)*Math.pow(q, i);
				double V = S*pi;
				ans += C*V;
			}
			System.out.printf("%.4f\n", ans);
		}
	}
}