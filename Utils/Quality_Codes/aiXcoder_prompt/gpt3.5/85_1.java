import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID85{
	/**
	* If the string passed in is not blank or null and did not end with the trailing value, then appended the trailing value to it and return the result 
	*/
	public static String appendTrailing(String str, String trailing){
			if(str!=null && !str.isEmpty() && !str.endsWith(trailing)){
			return str+trailing;
		}
		return str;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		System.out.println("Enter the trailing value: ");
		String trailing = sc.nextLine();
		String result = appendTrailing(str, trailing);
		System.out.println("Result: " + result);
	}
}