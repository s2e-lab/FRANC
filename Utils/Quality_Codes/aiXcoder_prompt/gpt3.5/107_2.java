import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID107{
	/**
	* Return true if the given array is not null or empty.
	*/
	public boolean checkNotNullOrEmpty(int[] array){
			if(array != null && array.length != 0){
			return true;
		}
		else{
			return false;
		}
	}
	
	/**
	* Return the sum of all elements in the given array.
	*/
	public int sumArray(int[] array){
		int sum = 0;
		for(int element: array){
			sum += element;
		}
		return sum;
	}
	
	/**
	* Return the product of all elements in the given array.
	*/
	public long multiplyArray(int[] array){
		long product = 1;
		for(int element: array){
			product *= element;
		}
		return product;
	}
	
	/**
	* Return true if the given integer is a prime number.
	*/
	public boolean checkPrime(int n){
		if(n <= 1){
			return false;
		}
		for(int i=2; i<=Math.sqrt(n); i++){
			if(n%i == 0){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {

		//test cases
		ID107 obj = new ID107();
		int[] array1 = null;
		int[] array2 = {};
		int[] array3 = {1,2,3,4,5};
		int[] array4 = {2,3,5,7};
		
		System.out.println("checkNotNullOrEmpty test cases:");
		System.out.println(obj.checkNotNullOrEmpty(array1)); //false
		System.out.println(obj.checkNotNullOrEmpty(array2)); //false
		System.out.println(obj.checkNotNullOrEmpty(array3)); //true
		
		System.out.println("sumArray test cases:");
		System.out.println(obj.sumArray(array1)); //0
		System.out.println(obj.sumArray(array2)); //0
		System.out.println(obj.sumArray(array3)); //15
		
		System.out.println("multiplyArray test cases:");
		System.out.println(obj.multiplyArray(array1)); //1
		System.out.println(obj.multiplyArray(array2)); //1
		System.out.println(obj.multiplyArray(array3)); //120
		
		System.out.println("checkPrime test cases:");
		System.out.println(obj.checkPrime(0)); //false
		System.out.println(obj.checkPrime(1)); //false
		System.out.println(obj.checkPrime(2)); //true
		System.out.println(obj.checkPrime(4)); //false
}
}