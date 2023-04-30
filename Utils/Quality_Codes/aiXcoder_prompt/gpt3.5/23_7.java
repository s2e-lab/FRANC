import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID23{
	/**
	* Returns the distance for the two given point
	*/
	public static float distance(float x0, float y0, float x1, float y1){
			return (float) Math.sqrt(Math.pow(x1 - x0, 2) + Math.pow(y1 - y0, 2));
}

/**
* Returns the area of the triangle formed by the three given points
*/
public static float triangleArea(float x0, float y0, float x1, float y1, float x2, float y2){
	float a = distance(x0, y0, x1, y1);
	float b = distance(x1, y1, x2, y2);
	float c = distance(x2, y2, x0, y0);
	float s = (a + b + c) / 2;
	return (float) Math.sqrt(s * (s - a) * (s - b) * (s - c));
}

public static void main(String[] args){
	float x0 = 0, y0 = 0, x1 = 3, y1 = 0, x2 = 0, y2 = 4;
	float area = triangleArea(x0, y0, x1, y1, x2, y2);
	System.out.println("Triangle area is : " + area);
}
}