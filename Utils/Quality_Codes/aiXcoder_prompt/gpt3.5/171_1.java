import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID171{
	/**
	* 去掉浮点数多余的0
	*/
	public static String rvZeroAndDot(String s){
			// Check if the input string is null or empty
		if(s == null || s.isEmpty()){
			return "";
		}
		
		// Check if the input string has a dot
		if(!s.contains(".")){
			return s;
		}
		
		// Remove any trailing zeros after the dot
		String result = s.replaceAll("0*$", "");
		
		// Check if the result string ends with a dot
		if(result.endsWith(".")){
			result = result.substring(0, result.length()-1); // Remove the last character (dot)
		}
		
		return result;
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		while((input = br.readLine()) != null){
			String output = rvZeroAndDot(input.trim());
			System.out.println(output);
		}
	}
}