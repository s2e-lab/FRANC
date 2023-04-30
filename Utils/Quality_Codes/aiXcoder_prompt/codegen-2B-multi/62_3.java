import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID62{
	/**
	* Calculates combinatorial number C(n,m). 
	*/
	public static int combinatorial(int n, int m){
		if(n>50) return 0;
        if(m>50) return 1;
		
		for(int i=n;i<=50;i++){
			int c=combinatorial(i,m);	
			int t=combinatorial((i-1),m);
			c=c+(100000*t)/(m+n-m*i);
			System.out.print(","+i);
			System.out.print(","+m);
			System.out.println(","+c);
		}

}
}