import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID23{
	/**
	* Returns the distance for the two given point
	*/
	public static float distance(float x0, float y0, float x1, float y1){
			float deltaX = x1 - x0;
		float deltaY = y1 - y0;
		float distance = (float) Math.sqrt(deltaX * deltaX + deltaY * deltaY);
		return distance;
	}

	/**
	* Returns the perimeter of a triangle given its three sides
	*/
	public static float trianglePerimeter(float side1, float side2, float side3){
		float perimeter = side1 + side2 + side3;
		return perimeter;
	}

	/**
	* Returns the area of a triangle given its three sides
	*/
	public static float triangleArea(float side1, float side2, float side3){
		// Using Heron's formula to calculate the area of the triangle
		float halfPerimeter = trianglePerimeter(side1, side2, side3) / 2;
		float area = (float) Math.sqrt(halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3));
		return area;
	}

	/**
	* Returns the area of a circle given its radius
	*/
	public static float circleArea(float radius){
		float area = (float) Math.PI * radius * radius;
		return area;
	}

	/**
	* Returns the volume of a sphere given its radius
	*/
	public static float sphereVolume(float radius){
		float volume = (4.0f/3.0f) * (float)Math.PI * radius * radius * radius;
		return volume;
	}
	
}