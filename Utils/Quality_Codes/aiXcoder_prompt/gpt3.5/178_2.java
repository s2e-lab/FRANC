import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID178{
	/**
	* Handles comparison between version numbers (the right way(TM))，bigger return 1 ，smaller return -1 and equals return 0. Examples of version strings: 1.6.7, 1.2_b10
	*/
	public static int versionCompare(String v1, String v2){
			// Splitting the versions based on the period "."
		String[] arr1 = v1.split("\\.");
		String[] arr2 = v2.split("\\.");
		
		int i = 0;
		// Loop to compare each part of the version
		while(i < arr1.length && i < arr2.length && arr1[i].equals(arr2[i])){
			i++;
		}
		
		// If there are still parts to compare
		if(i < arr1.length && i < arr2.length){
			int diff = Integer.valueOf(arr1[i]).compareTo(Integer.valueOf(arr2[i]));
			return Integer.signum(diff);
		}
		
		// If all parts are checked and still equal, check the length
		return Integer.signum(arr1.length - arr2.length);
	}
	
	
	public static void main(String[] args) throws Exception {
		// Sample test cases		
		System.out.println(versionCompare("1.6.0", "1.7.2"));
		System.out.println(versionCompare("2.2", "2.5.0"));
		System.out.println(versionCompare("3.4_b10", "3.4_b5"));
		System.out.println(versionCompare("1.10", "1.9.9"));
	}
}