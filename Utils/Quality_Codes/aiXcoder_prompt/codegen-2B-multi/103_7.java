import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID103{
	/**
	* Returns true if two doubles are considered equal. Tests if the absolute difference between the two doubles has a difference less then a given double (epsilon)Returns true if two doubles are considered equal. Tests if the absolute difference between the two doubles has a difference less then a given double (epsilon)
	*/
	public static boolean equals(double a, double b, double epsilon){
		return Math.abs(a-b)<epsilon;
	}
	public static void main(String[] args) throws IOException{
		Long long_var = parseLong("123");

		if(equals(123.0,long_var.doubleValue(),.001))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}

	}

	public static Long parseLong( String str ) throws IOException {
}
}