import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID85{
	/**
	* If the string passed in is not blank or null and did not end with the trailing value, then appended the trailing value to it and return the result 
	*/
	public static String appendTrailing(String str, String trailing){
			if(str != null && !str.isBlank() && !str.endsWith(trailing)){
          return str.concat(trailing);
      }
      return str;
	}
	
	/**
	* Computes and returns the number of rectangles in a grid of width x and height y
	*/
	public static int computeRectangles(int x, int y){
	    int sum = 0;
	    for(int i=1; i<=x; i++){
	        for(int j=1; j<=y; j++){
	            sum += (x-i+1)*(y-j+1);
	        }
	    }
	    return sum;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		String[] inputs;
		int target = 2000000;
		int closestCount = Integer.MAX_VALUE;
		int closestArea = 0;
		
		// loop through all possible rectangle dimensions and calculate the count of rectangles in each grid
		for(int x=1; x<=1000; x++){
		    for(int y=1; y<=1000; y++){
		        int count = computeRectangles(x,y);
		        int area = x*y;
		        
		        // check if count is closer to the target number of rectangles than the previous closest count
		        if(Math.abs(count - target) < closestCount){
		            closestCount = Math.abs(count - target);
		            closestArea = area;
		        }
		    }
		}
		
		System.out.println(closestArea);
	}
}