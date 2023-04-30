import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID93{
	/**
	* Check whether the String is a valid Java number
	*/
	public static boolean isNumber(String str){
			try{
	Double.parseDouble(str);
	return true;
}
catch(NumberFormatException e){
	return false;
}
}

/**
* Reverse a String
*/
public static String reverseString(String str){
	StringBuilder builder = new StringBuilder(str);
	return builder.reverse().toString();
}

/**
* Check whether the given number is a prime number
*/
public static boolean isPrime(int num){
	if(num <= 1) return false;
	for(int i=2;i<=Math.sqrt(num);i++){
		if(num%i == 0) return false;
	}
	return true;
}

/**
* Convert a decimal number to binary number
*/
public static String decimalToBinary(int num){
	return Integer.toBinaryString(num);
}

/**
* Calculate the factorial of a number
*/
public static int factorial(int num){
	if(num == 0 || num == 1) return 1;
	return num * factorial(num-1);
}

/**
* Sort an array in ascending order using bubble sort
*/
public static void bubbleSort(int[] arr){
	int n = arr.length;
	for(int i=0;i<n-1;i++){
		for(int j=0;j<n-i-1;j++){
			if(arr[j] > arr[j+1]){
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
	}
}

/**
* Print the triangle pattern of stars
*/
public static void printTriangle(int n){
	for(int i=1;i<=n;i++){
		for(int j=1;j<=i;j++){
			System.out.print("*");
		}
		System.out.println();
	}
}

public static void main(String[] args){
	// Testing the functions
	System.out.println(isNumber("123"));
	System.out.println(isNumber("abc"));
	System.out.println(reverseString("hello world!"));
	System.out.println(isPrime(17));
	System.out.println(decimalToBinary(10));
	System.out.println(factorial(5));
	int[] arr = {3,1,4,1,5,9};
	bubbleSort(arr);
	System.out.println(Arrays.toString(arr));
	printTriangle(5);
}
}