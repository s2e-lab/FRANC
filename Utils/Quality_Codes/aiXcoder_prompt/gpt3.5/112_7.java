import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID112{
	/**
	* Calculates the distance between two points in high-dimensional space.
	*/
	public static double length(double[] p0, double[] p1){
			double dist = 0.0;
		for(int i=0; i<p0.length; i++){
			dist += Math.pow(p0[i]-p1[i], 2);
		}
		return Math.sqrt(dist);
	}

	/**
	* Main method reads input from standard input, and prints the distance between the two points.
	*/
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int dim = sc.nextInt(); //dimension of the space
		double[] p0 = new double[dim];
		double[] p1 = new double[dim];
		for(int i=0; i<dim; i++){
			p0[i] = sc.nextDouble();
		}
		for(int i=0; i<dim; i++){
			p1[i] = sc.nextDouble();
		}
		sc.close();
		System.out.printf("%.10f", length(p0,p1));
	}

}