import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID103{
	/**
	* Returns true if two doubles are considered equal. Tests if the absolute difference between the two doubles has a difference less then a given double (epsilon)Returns true if two doubles are considered equal. Tests if the absolute difference between the two doubles has a difference less then a given double (epsilon)
	*/
	public static boolean equals(double a, double b, double epsilon){
			if (Math.abs(a - b) < epsilon) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for(int i=0;i<n;i++){
			//input
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();

			//calculate
			double delta = b*b - 4*a*c;
			double root1 = (-b + Math.sqrt(delta))/(2*a);
			double root2 = (-b - Math.sqrt(delta))/(2*a);

			//output
			if(equals(delta, 0, 0.00001)){
				System.out.println("Single Real Root: " + String.format("%.2f",root1));
			}else if(delta < 0){
				System.out.println("No Real Roots");
			}else{
				System.out.println("Two Real Roots: " + String.format("%.2f",root1) + " " + String.format("%.2f",root2));
			}

		}

		sc.close();
	}

}