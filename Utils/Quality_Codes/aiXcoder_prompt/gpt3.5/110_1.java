import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID110{
	/**
	* Converts the string argument into a float value.
	*/
	public static float parseFloat(String floatStr){
			return Float.parseFloat(floatStr);
	}
	
	/**
	* Calculates the area of a triangle using Heron's formula.
	*/
	public static double calculateTriangleArea(double a, double b, double c){
		double s = (a + b + c) / 2.0;
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}
	
	/**
	* Calculates the distance between two points.
	*/
	public static double calculateDistance(double x1, double y1, double x2, double y2){
		return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
	}
	
	public static void main (String[] args) throws java.lang.Exception{
		Scanner scanner = new Scanner(System.in);
		
		// Read the coordinates of the triangle vertices
		double ax = scanner.nextDouble();
		double ay = scanner.nextDouble();
		double bx = scanner.nextDouble();
		double by = scanner.nextDouble();
		double cx = scanner.nextDouble();
		double cy = scanner.nextDouble();
		
		// Calculate the length of the triangle sides
		double a = calculateDistance(ax, ay, bx, by);
		double b = calculateDistance(bx, by, cx, cy);
		double c = calculateDistance(ax, ay, cx, cy);
		
		// Calculate the area of the triangle
		double area = calculateTriangleArea(a, b, c);
		
		// Calculate the radius of the inscribed circle
		double radius = 2.0 * area / (a + b + c);
		
		// Output the radius of the inscribed circle
		System.out.printf("%.2f%n", radius);
	}
}