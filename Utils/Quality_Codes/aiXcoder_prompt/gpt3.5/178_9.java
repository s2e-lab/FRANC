import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID178{
	/**
	* Handles comparison between version numbers (the right way(TM))，bigger return 1 ，smaller return -1 and equals return 0. Examples of version strings: 1.6.7, 1.2_b10
	*/
	public static int versionCompare(String v1, String v2){
			String[] v1Split = v1.split("\\.");
		String[] v2Split = v2.split("\\.");
		int i=0;
		while(i<v1Split.length && i<v2Split.length && v1Split[i].equals(v2Split[i])){
			i++;
		}
		if(i<v1Split.length && i<v2Split.length){
			if(Integer.parseInt(v1Split[i])>Integer.parseInt(v2Split[i])){
				return 1;
			}else if(Integer.parseInt(v1Split[i])<Integer.parseInt(v2Split[i])){
				return -1;
			}else{
				return versionCompare(v1.substring(v1.indexOf('.')+1), v2.substring(v2.indexOf('.')+1));
			}
		}else{
			return Integer.compare(v1Split.length, v2Split.length);
		}
	}
}