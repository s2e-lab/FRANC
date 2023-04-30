import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID178{
	/**
	* Handles comparison between version numbers (the right way(TM))，bigger return 1 ，smaller return -1 and equals return 0. Examples of version strings: 1.6.7, 1.2_b10
	*/
	public static int versionCompare(String v1, String v2){
			// First, we split the version strings by dot (.) and underscore (_)
		String[] arr1 = v1.split("[._]");
		String[] arr2 = v2.split("[._]");
		
// Then, we compare each element of the two arrays
		int i=0;
		while(i<arr1.length && i<arr2.length){
			if(Integer.parseInt(arr1[i]) > Integer.parseInt(arr2[i])){
				return 1;
			}else if(Integer.parseInt(arr1[i]) < Integer.parseInt(arr2[i])){
				return -1;
			}else{
				i++;
			}
		}
		
// If we still haven't found any difference, we check the length of the arrays to determine the larger version number
		if(arr1.length > arr2.length){
			return 1;
		}else if(arr1.length < arr2.length){
			return -1;
		}else{
			return 0;
		}
	}
	
	/**
	* Main function to run the program
	*/
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String v1 = sc.next();
		String v2 = sc.next();
		
		int result = versionCompare(v1, v2);
		
		System.out.println(result);
	}
}