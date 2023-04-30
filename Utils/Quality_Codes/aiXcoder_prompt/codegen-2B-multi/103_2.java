import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID103{
	/**
	* Returns true if two doubles are considered equal. Tests if the absolute difference between the two doubles has a difference less then a given double (epsilon)Returns true if two doubles are considered equal. Tests if the absolute difference between the two doubles has a difference less then a given double (epsilon)
	*/
	public static boolean equals(double a, double b, double epsilon){
		System.out.println(a+" | "+b+":");
		if(Math.abs((a)) < epsilon && Math.abs((b)) < epsilon){
			return true;
		}
		if(Math.abs((a - b)) < epsilon){
			return true;
		}
		return false;
	}
	public static boolean equals(double a, double b){
    System.out.println(a+" | "+b+":");
}
}