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
* Returns the area of the triangle formed by three points in 2D space.
*/
public static double calculateTriangleArea(double x1, double y1, double x2, double y2, double x3, double y3){
	return Math.abs((x1*(y2-y3) + x2*(y3-y1)+ x3*(y1-y2))/2.0);
}

/**
* Returns the distance between two points in 2D space using the Pythagorean theorem.
*/
public static double calculateDistance(double x1, double y1, double x2, double y2){
	return Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
}

/**
* Main Method for ID103. Reads input from the console and outputs the solution.
*/
public static void main (String[] args) throws java.lang.Exception{
	Scanner sc = new Scanner(System.in);
	double x1, y1, x2, y2, x3, y3;
	
	//Read input for Point A
	x1 = sc.nextDouble();
	y1 = sc.nextDouble();
	
	//Read input for Point B
	x2 = sc.nextDouble();
	y2 = sc.nextDouble();
	
	//Read input for Point C
	x3 = sc.nextDouble();
	y3 = sc.nextDouble();
	
	//Calculate the length of each side
	double sideA = calculateDistance(x1, y1, x2, y2);
	double sideB = calculateDistance(x2, y2, x3, y3);
	double sideC = calculateDistance(x3, y3, x1, y1);
	
	//Use Heron's formula to calculate the area of the triangle
	double s = (sideA + sideB + sideC) / 2.0;
	double area = Math.sqrt(s*(s - sideA)*(s - sideB)*(s - sideC));
	
	//Output the area of the triangle formatted to 2 decimal places
	System.out.printf("%.2f", area);
}
}