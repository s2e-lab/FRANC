import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID62{
	/**
	* Calculates combinatorial number C(n,m). 
	*/
	public static int combinatorial(int n, int m){
		 int N = m;
		 
		for(int i=0;i<n;i++){
			N *= i;
			N += n;
		}
		return N;
	}	
	
	/**
	* Calculate A(1:n,m,k). 
	*/
	public static int productA(int n, int m, int k){
		 int A = k;
		 
}
}