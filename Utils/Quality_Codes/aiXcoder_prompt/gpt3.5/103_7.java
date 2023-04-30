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

public static void main (String[] args) throws java.lang.Exception{
	Scanner sc = new Scanner(System.in);
	double x1, y1, x2, y2, x3, y3, xc, yc;
	while(sc.hasNextDouble()){
		// Read input
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
		x3 = sc.nextDouble();
		y3 = sc.nextDouble();
		// Compute center of circle
		double A = x1*(y2-y3) - y1*(x2-x3) + x2*y3 - y2*x3;
		double B = (x1*x1 + y1*y1)*(y3-y2) + (x2*x2 + y2*y2)*(y1-y3) + (x3*x3 + y3*y3)*(y2-y1);
		double C = (x1*x1 + y1*y1)*(x2-x3) + (x2*x2 + y2*y2)*(x3-x1) + (x3*x3 + y3*y3)*(x1-x2);
		double D = (x1*x1 + y1*y1)*(x3*y2 - x2*y3) + (x2*x2 + y2*y2)*(x1*y3 - x3*y1) + (x3*x3 + y3*y3)*(x2*y1 - x1*y2);
		xc = -B/(2*A);
		yc = -C/(2*A);
		double radius = Math.sqrt((B*B + C*C - 4*A*D)/(4*A*A));
		// Output result
		System.out.printf(Locale.US, "%.3f %.3f %.3f\n", xc, yc, radius);
	}
}
}