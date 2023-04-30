import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID85{
	/**
	* If the string passed in is not blank or null and did not end with the trailing value, then appended the trailing value to it and return the result 
	*/
	public static String appendTrailing(String str, String trailing){
			if (str != null && !str.isBlank() && !str.endsWith(trailing)){
			return str + trailing;
		}
		return str;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String inputString = sc.nextLine();

		System.out.println("Enter a trailing value: ");
		String trailingValue = sc.nextLine();

		String result = appendTrailing(inputString, trailingValue);
		System.out.println("Result: " + result);
	}
}