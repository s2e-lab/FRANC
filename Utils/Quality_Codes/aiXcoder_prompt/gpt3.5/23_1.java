import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID23{
	/**
	* Returns the distance for the two given point
	*/
	public static float distance(float x0, float y0, float x1, float y1){
			float dx = x1 - x0;
		float dy = y1 - y0;
		return (float) Math.sqrt(dx*dx + dy*dy);
	}
	
	/**
	* Returns the midpoint for the two given points
	*/
	public static void midpoint(float x0, float y0, float x1, float y1){
		float midX = (x0 + x1) / 2;
		float midY = (y0 + y1) / 2;
		System.out.println("Midpoint: (" + midX + ", " + midY + ")");
	}
	
	/**
	* Main method to take input from user and calculate distance and midpoint
	*/
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter coordinates of first point (x0, y0):");
		float x0 = scanner.nextFloat();
		float y0 = scanner.nextFloat();
		System.out.println("Enter coordinates of second point (x1, y1):");
		float x1 = scanner.nextFloat();
		float y1 = scanner.nextFloat();
		float distance = distance(x0, y0, x1, y1);
		System.out.println("Distance: " + distance);
		midpoint(x0, y0, x1, y1);
	}
}