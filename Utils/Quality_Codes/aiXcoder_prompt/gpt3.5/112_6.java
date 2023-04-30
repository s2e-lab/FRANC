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
		for(int i=0; i<p0.length; i++){
			double diff = p0[i] - p1[i];
			sum += diff * diff;
		}
		return Math.sqrt(sum);
	}

	public static void main (String[] args) throws java.lang.Exception {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(); // number of dimensions
		int m = scanner.nextInt(); // number of points

		double[][] points = new double[m][n];
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				points[i][j] = scanner.nextDouble();
			}
		}

		double maxDist = 0.0;
		int maxI = 0;
		int maxJ = 0;

		for(int i=0; i<m; i++){
			for(int j=i+1; j<m; j++){
				double dist = length(points[i], points[j]);
				if(dist > maxDist){
					maxDist = dist;
					maxI = i;
					maxJ = j;
				}
			}
		}

		System.out.println(maxI + " " + maxJ + " " + String.format("%.6f", maxDist));
	}
}