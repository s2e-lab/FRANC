import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID103{
	/**
	* Returns true if two doubles are considered equal. Tests if the absolute difference between the two doubles has a difference less then a given double (epsilon)Returns true if two doubles are considered equal. Tests if the absolute difference between the two doubles has a difference less then a given double (epsilon)
	*/
	public static boolean equals(double a, double b, double epsilon){
			return (Math.abs(a - b) < epsilon);
}

	/**
	* Returns the value of x raised to the power of y.
	*/
	public static double power(double x, int y){
		if (y == 0) {
			return 1;
		}
		if (y < 0) {
			return 1 / power(x, -y);
		}
		double result = x;
		for (int i = 1; i < y; i++) {
			result *= x;
		}
		return result;
	}

	/**
	* Main function.
	*/
	public static void main(String[] args) throws java.lang.Exception{
		Scanner input = new Scanner(System.in);
		double x = input.nextDouble();
		int y = input.nextInt();
		double epsilon = 1e-6;
		
		// Calculate the value of x raised to the power of y
		double result = power(x, y);
		
		// Print the result
		if (equals(result, 1, epsilon)) {
			System.out.println("Result is 1");
		} else {
			System.out.printf("%.6f\n", result);
		}
	}
}