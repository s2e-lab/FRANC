import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID135{
	/**
	* Multiply two Short numbers.
	*/
	public static Short multiply(Short a, Short b){
		String ans="";
		if(a==0||b==0){
			return 0;
		}
		if(a==10000||b==10000){
			return 10000;
		}
		if(b>a) {
			Short swp=a;
			a=b;
			b=swp;
		}
		int cnt1=a;
		int cnt2=b;
}
}