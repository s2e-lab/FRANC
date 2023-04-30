import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID109{
	/**
	* subtract b from a
	*/
	public static String[] sub(String[] a, String[] b){
		String[] output = new String[b.length + 1];
		for(int i = 0; i < b.length; i++){
			output[i] = a[(i-1) * 2];
		}
		output[output.length - 1] = a[(a.length-1) * 2];
		return output;
	}
	
	/**
	* subtract two numbers
	*/
	public static String[] sub(String[] a, String[] b){
		String[] output = new String[a.length - 1];

}
}