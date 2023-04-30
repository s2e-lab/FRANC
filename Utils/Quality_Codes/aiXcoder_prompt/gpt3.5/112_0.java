import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID112{
	/**
	* Calculates the distance between two points in high-dimensional space.
	*/
	public static double length(double[] p0, double[] p1){
			double distance = 0.0;
			for(int i=0; i<p0.length; i++){
				distance += Math.pow(p0[i]-p1[i], 2);
			}
			return Math.sqrt(distance);
	}
	
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		double[][] points = new double[n][d];
		
		// Read in the points
		for(int i=0; i<n; i++){
			for(int j=0; j<d; j++){
				points[i][j] = sc.nextDouble();
			}
		}
		
		double maxDist = 0.0;
		double minDist = Double.POSITIVE_INFINITY;

		// Calculate the maximum and minimum distances between points
		for(int i=0; i<n; i++){
			for(int j=0; j<i; j++){
				double dist = length(points[i], points[j]);
				if(dist > maxDist){
					maxDist = dist;
				}
				if(dist < minDist){
					minDist = dist;
				}
			}
		}
		
		System.out.printf("%.2f %.2f", minDist, maxDist);
	}
}