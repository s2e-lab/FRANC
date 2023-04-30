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
	* Returns the distance between two sets of x, y coordinates
	*/
	public static float distance(float[] coords1, float[] coords2){
		float x1 = coords1[0];
		float y1 = coords1[1];
		float x2 = coords2[0];
		float y2 = coords2[1];
		return distance(x1, y1, x2, y2);
	}
	
	/**
	* Main method to run sample testing
	*/
	public static void main(String[] args){
		float[] coords1 = {3.0f, 5.0f};
		float[] coords2 = {6.0f, 8.0f};
		float dist = distance(coords1, coords2);
		System.out.println("Distance between coords1 and coords2: " + dist);
	}
}