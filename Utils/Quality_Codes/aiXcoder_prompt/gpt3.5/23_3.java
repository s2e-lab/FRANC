import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID23{
	/**
	* Returns the distance for the two given point
	*/
	public static float distance(float x0, float y0, float x1, float y1){
			return (float) Math.sqrt((x1 - x0) * (x1 - x0) + (y1 - y0) * (y1 - y0));
}

/**
* Returns the closest point to the given point from the given list of points
*/
public static float[] closestPoint(float x, float y, List<Float[]> points){
	float[] closest = {points.get(0)[0], points.get(0)[1]};
	float minDist = distance(x, y, points.get(0)[0], points.get(0)[1]);
	
	for(int i = 1; i < points.size(); i++){
		float dist = distance(x, y, points.get(i)[0], points.get(i)[1]);
		if(dist < minDist){
			minDist = dist;
			closest[0] = points.get(i)[0];
			closest[1] = points.get(i)[1];
		}
	}
	
	return closest;
}

public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	//read input
	int n = sc.nextInt();
	float x = sc.nextFloat();
	float y = sc.nextFloat();
	List<Float[]> points = new ArrayList<Float[]>();
	for(int i = 0; i < n; i++){
		float px = sc.nextFloat();
		float py = sc.nextFloat();
		points.add(new Float[]{px, py});
	}
	
	//get closest point
	float[] closest = closestPoint(x, y, points);
	
	//print output
	System.out.println(closest[0] + " " + closest[1]);
	
	//close scanner
	sc.close();
}
}