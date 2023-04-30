import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID85{
	/**
	* If the string passed in is not blank or null and did not end with the trailing value, then appended the trailing value to it and return the result 
	*/
	public static String appendTrailing(String str, String trailing){
			if(str != null && !str.isEmpty() && !str.endsWith(trailing)){
			return str + trailing;
		}
		else{
			return str;
		}
	}
	
	/**
	* Check if a given number is prime or not
	*/
	public static boolean isPrime(int n){
		if(n <= 1){
			return false;
		}
		for(int i=2; i<=Math.sqrt(n); i++){
			if(n%i == 0){
				return false;
			}
		}
		return true;
	}
	
	/**
	* Calculate the number of rectangles that can be formed by a grid of the given dimensions
	*/
	public static int calculateNumberOfRectangles(int width, int height){
		int numRectangles = 0;
		for(int i=1; i<=width; i++){
			for(int j=1; j<=height; j++){
				numRectangles += (width-i+1)*(height-j+1);
			}
		}
		return numRectangles;
	}
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		// Step 1: Take the input values
		System.out.println("Enter the value of width: ");
		int width = scanner.nextInt();
		
		System.out.println("Enter the value of height: ");
		int height = scanner.nextInt();
		
		// Step 2: Calculate the number of rectangles and print it
		int numRectangles = calculateNumberOfRectangles(width, height);
		System.out.println("Number of rectangles in grid of width " + width + " and height " + height + " is: " + numRectangles);
		
		// Step 3: Print all the prime numbers in a given range
		System.out.println("Enter the lower bound of range: ");
		int lowerBound = scanner.nextInt();
		
		System.out.println("Enter the upper bound of range: ");
		int upperBound = scanner.nextInt();
		
		System.out.println("Prime numbers in the given range are: ");
		for(int i=lowerBound; i<=upperBound; i++){
			if(isPrime(i)){
				System.out.print(i + " ");
			}
		}
		
		// Step 4: Append a trailing slash to a given string, if required
		System.out.println("\nEnter a string: ");
		String str = scanner.next();
		
}
}