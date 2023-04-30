import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID118{
	/**
	* 返回不小于输入值value的最小整数
	*/
	public static int floor(double val){
			return (int) Math.ceil(val);
	}
	
	/**
	* 计算欧拉函数phi(n)
	*/
	public static int phi(int n){
		int result = n; // 初始化为n
		for(int i=2; i*i<=n; i++){
			if(n%i == 0){
				result -= result/i; // 把所有因子i的贡献减去
				while(n%i == 0) n /= i; // 把n变为除i以外的因子
			}
		}
		if(n > 1) result -= result/n; // 处理除完前面所有因子后剩下的因子
		return result;
	}
	
	/**
	* 大数幂
	*/
	public static BigInteger pow(BigInteger base, BigInteger exponent, BigInteger mod){
		BigInteger result = BigInteger.ONE;
		while(exponent.compareTo(BigInteger.ZERO) > 0){
			if(exponent.and(BigInteger.ONE).equals(BigInteger.ONE)){
				result = result.multiply(base).mod(mod);
			}
			exponent = exponent.shiftRight(1);
			base = base.multiply(base).mod(mod);
		}
		return result;
	}
	
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		
		while(in.hasNext()){
			BigInteger a = in.nextBigInteger();
			BigInteger p = in.nextBigInteger();
			BigInteger phiOfp = BigInteger.valueOf(phi(p.intValue())); // 计算p的欧拉函数
			BigInteger ans = pow(a, phiOfp.subtract(BigInteger.ONE), p); // 根据公式计算答案
			out.println(ans);
		}
		
		in.close();
		out.close();
	}
}