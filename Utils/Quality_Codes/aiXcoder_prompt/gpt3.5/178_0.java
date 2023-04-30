import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID178{
	/**
	* Handles comparison between version numbers (the right way(TM))，bigger return 1 ，smaller return -1 and equals return 0. Examples of version strings: 1.6.7, 1.2_b10
	*/
	public static int versionCompare(String v1, String v2){
			String[] v1Array = v1.split("\\."); // Split v1 by periods
		String[] v2Array = v2.split("\\."); // Split v2 by periods

		int length = Math.max(v1Array.length, v2Array.length);

		for(int i=0; i<length; i++){
			int v1Part = i < v1Array.length ? Integer.parseInt(v1Array[i]) : 0;
			int v2Part = i < v2Array.length ? Integer.parseInt(v2Array[i]) : 0;
			if(v1Part < v2Part){
				return -1;
			}else if(v1Part > v2Part){
				return 1;
			}
		}
		return 0; // v1 equals v2 
	}
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String[] versions = new String[n];
		for(int i=0; i<n; i++){
			versions[i] = scanner.next();
		}

		Arrays.sort(versions, (v1, v2) -> versionCompare(v1, v2)); // Sort the versions using our custom comparison

		for(String version : versions){ // Print the sorted versions
			System.out.println(version);
		}
	}
}