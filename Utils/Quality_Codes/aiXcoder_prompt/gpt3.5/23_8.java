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
	* Returns the perimeter of the given triangle
	*/
	public static float perimeter(float x0, float y0, float x1, float y1, float x2, float y2){
		float a = distance(x0, y0, x1, y1);
		float b = distance(x1, y1, x2, y2);
		float c = distance(x2, y2, x0, y0);
		return a + b + c;
	}
	
	/**
	* Returns the area of the given triangle
	*/
	public static float area(float x0, float y0, float x1, float y1, float x2, float y2){
		float a = distance(x0, y0, x1, y1);
		float b = distance(x1, y1, x2, y2);
		float c = distance(x2, y2, x0, y0);
		float s = (a + b + c)/2;
		return (float) Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
	
	/**
	* Returns the centroid of the given triangle
	*/
	public static void centroid(float x0, float y0, float x1, float y1, float x2, float y2){
		float cx = (x0 + x1 + x2)/3;
		float cy = (y0 + y1 + y2)/3;
		System.out.println("Centroid: (" + cx + ", " + cy + ")");
	}
	
	public static void main(String[] args) throws Exception{
		// Sample input values
		float x0 = 0, y0 = 0;
		float x1 = 0, y1 = 4;
		float x2 = 3, y2 = 0;
		
		// Outputs for the given triangle
		float p = perimeter(x0, y0, x1, y1, x2, y2); // 12
		float a = area(x0, y0, x1, y1, x2, y2); // 6
		centroid(x0, y0, x1, y1, x2, y2); // Centroid: (
}
}