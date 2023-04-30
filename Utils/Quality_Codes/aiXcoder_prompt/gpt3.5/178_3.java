import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID178{
	/**
	* Handles comparison between version numbers (the right way(TM))，bigger return 1 ，smaller return -1 and equals return 0. Examples of version strings: 1.6.7, 1.2_b10
	*/
	public static int versionCompare(String v1, String v2){
			String[] v1Arr = v1.split("\\.");
		String[] v2Arr = v2.split("\\.");
		int len = Math.max(v1Arr.length, v2Arr.length);
		
		for(int i = 0; i < len; i++){
			Integer num1 = i < v1Arr.length ? Integer.parseInt(v1Arr[i].replaceAll("\\D", "")) : 0;
			Integer num2 = i < v2Arr.length ? Integer.parseInt(v2Arr[i].replaceAll("\\D", "")) : 0;
			
			if(num1 > num2){
				return 1;
			} else if(num1 < num2){
				return -1;
			}
		}
		
		return 0;
	}
}