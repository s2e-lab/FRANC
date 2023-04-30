import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID103{
	/**
	* Returns true if two doubles are considered equal. Tests if the absolute difference between the two doubles has a difference less then a given double (epsilon)Returns true if two doubles are considered equal. Tests if the absolute difference between the two doubles has a difference less then a given double (epsilon)
	*/
	public static boolean equals(double a, double b, double epsilon){
		return Math.abs(a-b)<=epsilon;
	}

	public static void main(String[] args) throws java.lang.Exception{
		// Enter your code here. Read input from STDIN. Print output to STDOUT
		Scanner input = new Scanner(System.in);
		double a = 0,b = 0;
		double epsilon = input.nextDouble();
}
}