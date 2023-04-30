import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID62{
	/**
	* Calculates combinatorial number C(n,m). 
	*/
	public static int combinatorial(int n, int m){
		 int r=0, k=m/2, c;
		 if(n%2==0){
			 c=k;
			 k=n/2;
		 }else{
			 if(n%2==1){
				 r=k;
				 k=n/2;
			 }else{
				 r=k+n/2;
				 k=n/2;
			 }
		 }

	   return k + r;
	}

	/**
	* Calculates total number of iterations C(n,m).
	*/
}