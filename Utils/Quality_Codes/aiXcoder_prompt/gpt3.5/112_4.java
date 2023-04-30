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
		for(int i=0;i<p0.length;i++){
			sum += Math.pow(p0[i]-p1[i],2);
		}
		return Math.sqrt(sum);
	}

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = "";
		boolean firstLine = true;
		int n = 0;
		double[][] points = null;
		
		// read input until EOF
		while((input=br.readLine()) != null){
			if(firstLine){
				n = Integer.parseInt(input.trim());
				points = new double[n][];
				firstLine = false;
			}
			else{
				StringTokenizer st = new StringTokenizer(input.trim());
				int id = Integer.parseInt(st.nextToken());
				double[] p = new double[n];
				for(int i=0;i<n;i++){
					p[i] = Double.parseDouble(st.nextToken());
				}
				points[id-1] = p;
			}
		}

		// calculate the minimum distance between points
		double minDistance = Double.MAX_VALUE;
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				double distance = length(points[i],points[j]);
				if(distance<minDistance) minDistance = distance;
			}
		}
		
		System.out.println(String.format("%.4f",minDistance));
	}
} 