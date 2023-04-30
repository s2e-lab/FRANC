import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID62{
	/**
	* Calculates combinatorial number C(n,m). 
	*/
	public static int combinatorial(int n, int m){
		if(m<0)return 0; // TODO: add error checking
		Integer d = factorial(m);
		return factorial(n) / d;
	}

	public static Long factorial(int n) {
		if(n==0) return 1l;
		if(n==1) return 1l;
 
		Long f = 1l, k = n;
		while (k>0)
			f*=k--;
		return f;
	}
}
