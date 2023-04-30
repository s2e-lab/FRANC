import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID103{
	/**
	* Returns true if two doubles are considered equal. Tests if the absolute difference between the two doubles has a difference less then a given double (epsilon)Returns true if two doubles are considered equal. Tests if the absolute difference between the two doubles has a difference less then a given double (epsilon)
	*/
	public static boolean equals(double a, double b, double epsilon){
			return Math.abs(a - b) < epsilon;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double epsilon = sc.nextDouble();
		
		if(equals(a, b, epsilon)){
			System.out.println("EQUAL");
		}else{
			System.out.println("NOT EQUAL");
		}
	}
} 

// This program takes in two double values and an epsilon value and checks if the difference between the two doubles is within the range of epsilon. If it is, then the program prints "EQUAL", else it prints "NOT EQUAL". This is a common technique in programming when dealing with floating-point values, where small differences in values can occur due to the way floating-point numbers are represented in a computer's memory.