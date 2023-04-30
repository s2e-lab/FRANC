import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID178{
	/**
	* Handles comparison between version numbers (the right way(TM))，bigger return 1 ，smaller return -1 and equals return 0. Examples of version strings: 1.6.7, 1.2_b10
	*/
	public static int versionCompare(String v1, String v2){
			// Split the version strings into an array of integers
		String[] v1Array = v1.split("\\.");
		String[] v2Array = v2.split("\\.");
		
		// Get the maximum length of the arrays
		int maxLength = Math.max(v1Array.length, v2Array.length);
		
		// Pad the arrays with zeroes
		v1Array = padArray(v1Array, maxLength);
		v2Array = padArray(v2Array, maxLength);

		// Compare the version numbers
		for (int i = 0; i < maxLength; i++) {
			int num1 = Integer.parseInt(v1Array[i]);
			int num2 = Integer.parseInt(v2Array[i]);
			if (num1 > num2) {
				return 1;
			} else if (num1 < num2) {
				return -1;
			}
		}

		// The version numbers are equal
		return 0;
	}
	
	/**
	* Pads an array with zeroes until it reaches the specified length.
	*/
	private static String[] padArray(String[] array, int length) {
		String[] paddedArray = Arrays.copyOf(array, length);
		for (int i = array.length; i < length; i++) {
			paddedArray[i] = "0";
		}
		return paddedArray;
	}


	public static void main (String[] args) throws java.lang.Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String [] s= br.readLine().split(" ");
		String v1 = s[0];
		String v2 = s[1];
		System.out.println(versionCompare(v1, v2));
	}
}