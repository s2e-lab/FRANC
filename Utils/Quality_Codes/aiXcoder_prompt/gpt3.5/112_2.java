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
			sum += Math.pow(p1[i]-p0[i], 2); // square the difference and add to sum
		}
		return Math.sqrt(sum); // take the square root of the sum and return as distance
	}

	/**
	* Main function to read input, call distance calculation function, and print output.
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // number of test cases

		for(int i=0; i<n; i++){
			int d = sc.nextInt(); // number of dimensions
			double[] p0 = new double[d];
			double[] p1 = new double[d];

			// read in first point
			for(int j=0; j<d; j++){
				p0[j] = sc.nextDouble();
			}

			// read in second point
			for(int j=0; j<d; j++){
				p1[j] = sc.nextDouble();
			}

			double distance = length(p0, p1); // calculate distance

			// print output
			System.out.printf("%.2f\n", distance);
		}
	}
}