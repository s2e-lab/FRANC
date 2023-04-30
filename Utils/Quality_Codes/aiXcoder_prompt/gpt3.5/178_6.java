import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID178{
	/**
	* Handles comparison between version numbers (the right way(TM))，bigger return 1 ，smaller return -1 and equals return 0. Examples of version strings: 1.6.7, 1.2_b10
	*/
	public static int versionCompare(String v1, String v2){
			// Splitting version strings into arrays of integers
		String[] v1Parts = v1.split("[._-]");
		String[] v2Parts = v2.split("[._-]");
		int v1Len = v1Parts.length;
		int v2Len = v2Parts.length;
		
		// Finding the longest array, we will iterate over all of its elements
		int maxLen = Math.max(v1Len, v2Len);
		for (int i = 0; i < maxLen; i++) {
			int v1Part = i < v1Len ? Integer.parseInt(v1Parts[i]) : 0; // Setting part to 0 if it is not present
			int v2Part = i < v2Len ? Integer.parseInt(v2Parts[i]) : 0; // same as above
			
			// Comparing parts
			if (v1Part < v2Part)
				return -1;
			else if (v1Part > v2Part)
				return 1;
		}
		// If all parts are equal, versions are equal too
		return 0;
	}

	public static void main(String[] args) throws java.lang.Exception{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

		String str = r.readLine();

		String[] strList = str.split(" ");

		System.out.println(versionCompare(strList[0], strList[1]));
	}
}