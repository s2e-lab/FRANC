import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID62{
	/**
	* Calculates combinatorial number C(n,m). 
	*/
	public static int combinatorial(int n, int m){
			if ( n==0 ) return 0;
			if ( m==0 ) return 1;
			if ( n<=m ) return n + n*combinatorial(m-1);
			int res=0;
			n=n/m;
			m=m;
			for (int i=0; i<=n; i++){
				if (i%m==0) res++;
			}
			return res;
	}
}