import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID112{
	/**
	* Calculates the distance between two points in high-dimensional space.
	*/
	public static double length(double[] p0, double[] p1){
			double sumOfSquares = 0;
			for (int i = 0; i < p0.length; i++){
				sumOfSquares += Math.pow(p0[i] - p1[i], 2);
			}
			return Math.sqrt(sumOfSquares);
		}
		
	/**
	* Main method to test the length method with sample inputs.
	*/
	public static void main(String[] args) {
		double[] p0 = {1, 2, 3};
		double[] p1 = {4, 5, 6};
		double length = length(p0, p1);
		System.out.println("The length between points p0 and p1 is " + length);
	}
}