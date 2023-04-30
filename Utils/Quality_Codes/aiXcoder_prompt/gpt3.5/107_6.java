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
		return false;
	}

	/**
	* Return the sum of all the even elements in the given array.
	* If the array is null or empty, return -1.
	*/
	public int getSumOfEven(int[] array){
		int sum = 0;
		if(checkNotNullOrEmpty(array)){
			for(int i = 0; i < array.length; i++){
				if(array[i] % 2 == 0){
					sum += array[i];
				}
			}
			return sum;
		}
		return -1;
	}

	/**
	* Return the product of all the odd elements in the given array.
	* If the array is null or empty, return -1.
	*/
	public BigInteger getProductOfOdd(int[] array){
		BigInteger product = BigInteger.ONE;
		if(checkNotNullOrEmpty(array)){
			for(int i = 0; i < array.length; i++){
				if(array[i] % 2 != 0){
					product = product.multiply(BigInteger.valueOf(array[i]));
				}
			}
			return product;
		}
		return BigInteger.valueOf(-1);
	}

	public static void main(String[] args){
		ID107 obj = new ID107();
		int[] array = {1, 2, 3, 4, 5};
		System.out.println(obj.getSumOfEven(array)); // should print 6
		System.out.println(obj.getProductOfOdd(array)); // should print 15
	}
}