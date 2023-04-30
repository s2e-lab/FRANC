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
		return (float) Math.sqrt((deltaX * deltaX) + (deltaY * deltaY));
	}

	/**
	* Returns the perimeter of the given triangle
	*/
	public static float perimeter(float x1, float y1, float x2, float y2, float x3, float y3){
		float side1 = distance(x1, y1, x2, y2);
		float side2 = distance(x2, y2, x3, y3);
		float side3 = distance(x3, y3, x1, y1);
		return side1 + side2 + side3;
	}

	/**
	* Returns the area of the given triangle
	*/
	public static float area(float x1, float y1, float x2, float y2, float x3, float y3){
		float side1 = distance(x1, y1, x2, y2);
		float side2 = distance(x2, y2, x3, y3);
		float side3 = distance(x3, y3, x1, y1);
		float s = (side1 + side2 + side3) / 2;
		return (float) Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}

	public static void main(String[] args) throws Exception {
		//Reading input from input.txt file
		File file = new File("input.txt");
		Scanner sc = new Scanner(file);
		String line = sc.nextLine();
		String[] points = line.split(" ");
		float x1 = Float.parseFloat(points[0]);
		float y1 = Float.parseFloat(points[1]);
		float x2 = Float.parseFloat(points[2]);
		float y2 = Float.parseFloat(points[3]);
		float x3 = Float.parseFloat(points[4]);
		float y3 = Float.parseFloat(points[5]);

		//Calculating perimeter and area
		float p = perimeter(x1, y1, x2, y2, x3, y3);
		float a = area(x1, y1, x2, y2, x3, y3);

		//Writing output to output.txt file
		FileWriter fw = new FileWriter("output.txt");
}
}