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
			sum += Math.pow((p1[i]-p0[i]), 2);
		}
		return Math.sqrt(sum);
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of points: ");
		int n = sc.nextInt();
		double[][] points = new double[n][];
		
		//input the points
		for(int i=0; i<n; i++){
			System.out.println("Enter the number of dimensions for point " + (i+1) + ": ");
			int dim = sc.nextInt();
			points[i] = new double[dim];
			System.out.println("Input the coordinates for point " + (i+1) + ": ");
			for(int j=0; j<dim; j++){
				points[i][j] = sc.nextDouble();
			}
		}
		
		//calculate the pairwise distances
		double[][] distances = new double[n][n];
		for(int i=0; i<n; i++){
			for(int j=i+1; j<n; j++){
				distances[i][j] = length(points[i], points[j]);
				distances[j][i] = distances[i][j];
			}
		}
		
		//output the pairwise distances
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				System.out.print(distances[i][j] + " ");
			}
			System.out.println();
		}
	}
}