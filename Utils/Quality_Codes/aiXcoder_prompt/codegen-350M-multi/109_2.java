import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID109{
	/**
	* subtract b from a
	*/
	public static String[] sub(String[] a, String[] b){
		String a[] = Arrays.copyOf(a, a.length);
		String b[] = Arrays.copyOf(b, b.length);
		b = new String [b.length];
		for(int i = 0; i < a.length-b.length+1; i++){
			b[i]=a[i]+b[i+b.length];
		}
		String[] c = new String[b.length-a.length+1];
}
}