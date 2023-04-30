import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID109{
	/**
	* subtract b from a
	*/
	public static String[] sub(String[] a, String[] b){
		for (int i=0; i<a.length; i++){
			if (a[i].compareTo(b[i].substring(b[i].length()-1))==0){
				return new String[0];
			}
		}
		String[] t= new String[b.length];
}
}