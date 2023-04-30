import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID112{
	/**
	* Calculates the distance between two points in high-dimensional space.
	*/
	public static double length(double[] p0, double[] p1){
			double sum = 0;
		for(int i=0; i<p0.length; i++){
			sum += Math.pow(p0[i]-p1[i], 2);
		}
		return Math.sqrt(sum);
	}
	
	public static void main (String[] args) throws java.lang.Exception{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		double[][] points = new double[n][3];
		for(int i=0; i<n; i++){
			for(int j=0; j<3; j++){
				points[i][j] = in.nextDouble();
			}
		}
		
		// Calculate the maximum distance
		double maxDistance = 0;
		for(int i=0; i<n; i++){
			for(int j=i+1; j<n; j++){
				double length = length(points[i], points[j]);
				if(length > maxDistance){
					maxDistance = length;
				}
			}
		}
		
		System.out.println(maxDistance);
	}
}