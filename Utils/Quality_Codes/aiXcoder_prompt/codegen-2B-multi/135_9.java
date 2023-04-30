import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID135{
	/**
	* Multiply two Short numbers.
	*/
	public static Short multiply(Short a, Short b){
		if(a==0 || b==0)return 0;
		long ret=abs(a)%(abs(b)+1);
		if(ret==0)ret=a%b;
		return (short)ret;
	}

    public static void main(String[] args) throws IOException{
		FastScanner in=new FastScanner(System.in);
		int T=in.nextInt();
		int[] a=new int[T];
		int[] b=new int[T];
}
}