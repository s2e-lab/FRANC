import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID178{
	/**
	* Handles comparison between version numbers (the right way(TM))，bigger return 1 ，smaller return -1 and equals return 0. Examples of version strings: 1.6.7, 1.2_b10
	*/
	public static int versionCompare(String v1, String v2){
			//splitting the version strings by '.' and '_' to compare each integer in the version number
		String[] v1Arr = v1.split("[._]");
		String[] v2Arr = v2.split("[._]");

		int length = Math.max(v1Arr.length, v2Arr.length);

		for(int i=0; i<length; i++){
			int v1Int = i < v1Arr.length ? Integer.parseInt(v1Arr[i]) : 0;
			int v2Int = i < v2Arr.length ? Integer.parseInt(v2Arr[i]) : 0;
			if(v1Int < v2Int) return -1;
			if(v1Int > v2Int) return 1;
		}
		return 0; //versions are equal
	}

	//main method to test the versionCompare method
	public static void main(String[] args){
		String v1 = "1.6.7";
		String v2 = "1.2_b10";
		int result = versionCompare(v1, v2);
		System.out.println("Comparison result is " + result);
	}
}