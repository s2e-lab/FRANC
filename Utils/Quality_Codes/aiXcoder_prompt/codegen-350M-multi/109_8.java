import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID109{
	/**
	* subtract b from a
	*/
	public static String[] sub(String[] a, String[] b){
		String[] temp= new String[b.length];
		for(int i=0;i<(b.length);i++){
			temp[i] = a[i] + b[i];
		}
		return temp ;
	}
}