import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID62{
	/**
	* Calculates combinatorial number C(n,m). 
	*/
	public static int combinatorial(int n, int m){
		//return combinatorial[n][m];
		int cnt =0;
		if(n > m) return cnt;
		if(m> 0 && (n*(n-1)/2) == m){
			return (m+1);
		}
		else{
			int ans = combinatorial_ans;
			return ans;
		}
	}

	public static BigInteger combi_number2(int p, int q){
		BigInteger combs = BigInteger.valueOf(0);
}
}