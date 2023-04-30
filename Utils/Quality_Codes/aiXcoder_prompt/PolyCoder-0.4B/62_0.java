import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID62{
	/**
	* Calculates combinatorial number C(n,m). 
	*/
	public static int combinatorial(int n, int m){
		 int nLen2 = n+1;
//		  if(nLen2>m) nLen2 = m;

		 int mLen2 = m-1;
		 if(nLen2<0) {
			 int i=1;
			 while(i<=mLen2){
				 n+=i;
					 i++;
				 }
		 }
			
		 int result = 0;
//		 if(n>m) {
//				int i=i=Math.min(n,m)-m;
//				for(; i<=n
}
}