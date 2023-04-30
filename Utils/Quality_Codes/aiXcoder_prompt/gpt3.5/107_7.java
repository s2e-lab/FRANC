import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID107{
	/**
	* Return true if the given array is not null or empty.
	*/
	public boolean checkNotNullOrEmpty(int[] array){
			if(array != null && array.length > 0){
			return true;
		}
		else{
			return false;
		}
	}
	
	/**
	* Calculate the power of x to the n.
	*/
	public double calculatePower(double x, int n){
		return Math.pow(x, n);
	}
	
	/**
	* Return the factorial of the given number.
	*/
	public long calculateFactorial(int n){
		if(n < 0){
			throw new IllegalArgumentException("Number should be non negative.");
		}
		long fact = 1;
		for(int i=1; i<=n; i++){
			fact *= i;
		}
		return fact;
	}
	
	/**
	* Swap the values of two integers.
	*/
	public void swapIntegers(int a, int b){
		System.out.println("Before swapping: a="+a+", b="+b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After swapping: a="+a+", b="+b);
	}
	
	/**
	* Reverse the elements of the given array.
	*/
	public void reverseArray(int[] array){
		System.out.println("Before reversing: "+Arrays.toString(array));
		int n = array.length;
		for(int i=0; i<n/2; i++){
			int temp = array[i];
			array[i] = array[n-i-1];
			array[n-i-1] = temp;
		}
		System.out.println("After reversing: "+Arrays.toString(array));
	}
	
	/**
	* Return the sum of elements of the given array.
	*/
	public int calculateSum(int[] array){
		int sum = 0;
		for(int i=0; i<array.length; i++){
			sum += array[i];
		}
		return sum;
	}
}