import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID85{
	/**
	* If the string passed in is not blank or null and did not end with the trailing value, then appended the trailing value to it and return the result 
	*/
	public static String appendTrailing(String str, String trailing){
			if(str != null && !str.trim().isEmpty() && !str.endsWith(trailing)){
				return str + trailing;
			}
			return str;
		}

	/**
	* Given an array of integers, return true if any two elements have the same value
	*/
	public static boolean containsDuplicates(int[] arr){
			if(arr == null || arr.length == 0){
				return false; // empty array or null array can't have duplicates
			}
			Set<Integer> set = new HashSet<>();
			for(int i=0;i<arr.length;i++){
				if(set.contains(arr[i])){
					return true;
				}
				set.add(arr[i]);
			}
			return false; // no duplicates found
		}

	/**
	* Given a string and a delimiter, return a list of substrings obtained by splitting the string based on the provided delimiter
	*/
	public static List<String> splitString(String str, String delimiter){
			List<String> list = new ArrayList<>();
			if(str == null || delimiter == null){
				return list; // return empty list if input is invalid
			}
			StringTokenizer tokenizer = new StringTokenizer(str, delimiter);
			while(tokenizer.hasMoreTokens()){
				list.add(tokenizer.nextToken());
			}
			return list;
		}

	/**
	* Given an array of integers, return the sum of all odd numbers present in the array
	*/
	public static int sumOfOddNumbers(int[] arr){
			if(arr == null || arr.length == 0){
				return 0; // empty array or null array can't have any odd numbers
			}
			int sum = 0;
			for(int i=0;i<arr.length;i++){
				if(arr[i] % 2 != 0){
					sum += arr[i];
				}
			}
			return sum;
		}

	/**
	* Given two integers, return the result of their multiplication. However, if any of the input is zero, return zero
	*/
	public static int multiply(int a, int b){
			if(a == 0 || b == 0){
				return 0;
			}
			return a*b;
		}
}

//Sample usage of the above functions