import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID107{
	/**
	* Return true if the given array is not null or empty.
	*/
	public boolean checkNotNullOrEmpty(int[] array){
			if(array != null && array.length > 0) {
				return true;
			}
			else {
				return false;
			}
		}
		
		/**
		* Given an array of integers, return the sum of all the elements in the array.
		* If the array is null or empty, return 0.
		*/
		public int getSum(int[] array) {
			if(checkNotNullOrEmpty(array)) {
				int sum = 0;
				for(int i=0; i<array.length; i++) {
					sum += array[i];
				}
				return sum;
			}
			else {
				return 0;
			}
		}
		
		/**
		* Given an array of integers, return the product of all the elements in the array.
		* If the array is null or empty, return 0.
		*/
		public BigInteger getProduct(int[] array) {
			if(checkNotNullOrEmpty(array)) {
				BigInteger product = BigInteger.valueOf(1);
				for(int i=0; i<array.length; i++) {
					product = product.multiply(BigInteger.valueOf(array[i]));
				}
				return product;
			}
			else {
				return BigInteger.valueOf(0);
			}
		}
		
		/**
		* Given an array of integers, return the maximum value in the array.
		* If the array is null or empty, return Integer.MIN_VALUE.
		*/
		public int getMax(int[] array) {
			if(checkNotNullOrEmpty(array)) {
				int max = Integer.MIN_VALUE;
				for(int i=0; i<array.length; i++) {
					if(array[i] > max) {
						max = array[i];
					}
				}
				return max;
			}
			else {
				return Integer.MIN_VALUE;
			}
		}
		
		/**
		* Given an array of integers, return the minimum value in the array.
		* If the array is null or empty, return Integer.MAX_VALUE.
		*/
		public int getMin(int[] array) {
			if(checkNotNullOrEmpty(array)) {
				int min = Integer.MAX_VALUE;
				for(int i=0; i<array.length; i++) {
					if(array[i] < min) {
						min = array[i];
					}
				}
				return min;
			}
			else {
				return Integer.MAX_VALUE;
			}

}
}