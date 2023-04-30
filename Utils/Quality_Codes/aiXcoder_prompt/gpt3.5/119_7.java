import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID119{
	/**
	* 保留两位小数
	*/
	public static String formatDouble(double val){
			String formatted = String.format("%.2f", val);
			return formatted;
		}
    
	/**
	* 计算二项分布的概率
	*/
	public static double binomialDistribution(double p, int n, int k){
		double result = 0.0;
		BigDecimal numerator = new BigDecimal(Math.pow(p, k));
		BigDecimal denominator = new BigDecimal(Math.pow((1-p), (n-k)));
		BigDecimal combinatorial = new BigDecimal(combination(n, k));

		result = numerator.multiply(denominator).multiply(combinatorial).doubleValue();

		return result;
	}

	/**
	* 计算组合数C(n, k)
	*/
	public static long combination(int n, int k){
		long result = 1;
		for(int i=n-k+1;i<=n;i++){
			result *= i;
		}
		for(int i=1;i<=k;i++){
			result /= i;
		}
		return result;
	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		while(in.hasNext()){
			double p = in.nextDouble();
			int n = in.nextInt();
			int k = in.nextInt();

			//计算二项分布概率
			double prob = binomialDistribution(p, n, k);

			//保留两位小数
			String formattedProb = formatDouble(prob);

			System.out.println(formattedProb);
		}
	}
}