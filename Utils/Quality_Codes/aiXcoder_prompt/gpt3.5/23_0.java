import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID23{
	/**
	* Returns the distance for the two given point
	*/
	public static float distance(float x0, float y0, float x1, float y1){
			return (float) Math.sqrt(Math.pow((x1-x0),2) + Math.pow((y1-y0),2));
	}
	
	/**
	* Returns the center point of the given set of points
	*/
	public static float[] findCenter(float[][] points){
		int numPoints = points.length;
		float centerX = 0, centerY = 0;
		
		for(int i=0; i<numPoints; i++){
			centerX += points[i][0];
			centerY += points[i][1];
		}
		
		centerX /= numPoints;
		centerY /= numPoints;
		
		return new float[]{centerX, centerY};
	}
	
	/**
	* Returns the area of the given triangle with vertices A, B and C
	*/
	public static float triangleArea(float[] A, float[] B, float[] C){
		return Math.abs((A[0]*(B[1]-C[1]) + B[0]*(C[1]-A[1]) + C[0]*(A[1]-B[1]))/2);
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
}
}