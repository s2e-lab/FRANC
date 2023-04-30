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

	/**
	* Calculates the sum of the digits of a given integer
	*/
	public static int digitSum(int n){
		int sum = 0;
		while(n > 0){
			sum += n % 10;
			n = n / 10;
		}
		return sum;
	}

	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		while(true){
			int n = in.nextInt();
			if(n == 0){
				break;
			}

			double a = Math.sqrt(n);
			double b = Math.cbrt(n);
			double epsilon = 0.000001; //Choose a small value for epsilon

			if(equals(a, Math.ceil(a), epsilon) && equals(b, Math.ceil(b), epsilon)){
				System.out.println(n + " " + digitSum(n));
			} else {
				System.out.println(n + " " + "no");
			}
		}

		
	}
}