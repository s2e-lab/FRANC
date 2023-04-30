import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID112{
	/**
	* Calculates the distance between two points in high-dimensional space.
	*/
	public static double length(double[] p0, double[] p1){
			double sum = 0.0;
    		for (int i = 0; i < p0.length; i++) {
        		sum += Math.pow(p0[i] - p1[i], 2);
    		}
    		return Math.sqrt(sum);
	}

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // number of points
		int d = sc.nextInt(); // number of dimensions
		
		double[][] points = new double[n][d];
		
		// read the coordinates of all the points
		for(int i=0;i<n;i++){
			for(int j=0;j<d;j++){
				points[i][j] = sc.nextDouble();
			}
		}
		
		double maxDistance = 0;
		
		// calculate the distance between all pairs of points and 
		// find the pair with maximum distance
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				double distance = length(points[i], points[j]);
				if(distance > maxDistance){
					maxDistance = distance;
				}
			}
		}
		
		System.out.println(maxDistance);

	} 
}