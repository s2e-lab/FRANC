import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID103{
	/**
	* Returns true if two doubles are considered equal. Tests if the absolute difference between the two doubles has a difference less then a given double (epsilon)Returns true if two doubles are considered equal. Tests if the absolute difference between the two doubles has a difference less then a given double (epsilon)
	*/
	public static boolean equals(double a, double b, double epsilon){
		if(Math.abs(a-b)<epsilon){
			return true;
		}
		return false;
	}

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		// System.out.println("  Enter an integer: ");
		// int max = Integer.MIN_VALUE;
		int size = 0;
		// max = scan.nextInt();
		int n = scan.nextInt();

		int[] arr;
		arr = new int[n];

		
}
}