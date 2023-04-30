import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID23{
	/**
	* Returns the distance for the two given point
	*/
	public static float distance(float x0, float y0, float x1, float y1){
			return (float)Math.sqrt((x0-x1)*(x0-x1) + (y0-y1)*(y0-y1));
}

/**
* Returns the radius of the circle passing through the three given points
*/
public static float circumradius(float x1, float y1, float x2, float y2, float x3, float y3){
	float a = distance(x1,y1,x2,y2);
	float b = distance(x2,y2,x3,y3);
	float c = distance(x3,y3,x1,y1);
	float s = (a + b + c)/2;
	float area = (float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
	float circumradius = (a * b * c) / (4*area);
	return circumradius;
}

/**
* Main method to read input from user and print the result
*/
public static void main(String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	int n = Integer.parseInt(reader.readLine().trim());

	float[][] points = new float[n][2];

	for(int i=0; i<n; i++){
		String[] inputLine = reader.readLine().split(" ");
		points[i][0] = Float.parseFloat(inputLine[0]);
		points[i][1] = Float.parseFloat(inputLine[1]);
	}

	float maxRadius = -1;

	for(int i=0; i<n; i++){
		for(int j=i+1; j<n; j++){
			for(int k=j+1; k<n; k++){
				float radius = circumradius(points[i][0], points[i][1], points[j][0], points[j][1], points[k][0], points[k][1]);
				if(radius > maxRadius){
					maxRadius = radius;
				}
			}
		}
	}

	System.out.printf("%.2f\n", maxRadius);
}
}