import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID176{
	/**
	* Returns true if the bit at the given position is 1 and false otherwise.
	*/
	public static boolean getBinaryState(int targetInteger, int position){
		return (Integer.toBinaryString(targetInteger).charAt(position) == '1');
	}

	/**
	* Calculate the binary representation of a number
	*/
	public static String binary(int x){
		String s = "";
		while(x>=1)
		{
			s += (Integer.toBinaryString(x)&1);
			x = x>>1;
		}
		return s;
	}
	public static void main(String[] args){
}
}