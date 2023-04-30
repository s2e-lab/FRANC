import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ArrayUtil{
	/** 
	 * Swaps the two elements at the specified indices in the given array.
	 * @param < V > the type of elements in the array
	 * @param arr the array
	 * @param i the index of the first element
	 * @param j the index of the second element
	 */
	
	public static final <V>void swap(V[] arr,int i,int j){
			V temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		
		/**
		 * Generates an array of random integers with the specified length and range.
		 * @param length the length of the array
		 * @param range the range of the integers in the array (from 0 inclusive to range exclusive)
		 * @return the generated array of random integers
		 */
		
		public static int[] generateRandomIntArray(int length,int range){
			Random random=new Random();
			int[] arr=new int[length];
			for(int i=0;i<length;i++){
				arr[i]=random.nextInt(range);
			}
			return arr;
		}
		
		/**
		 * Generates an array of random doubles with the specified length and range.
		 * @param length the length of the array
		 * @param range the range of the doubles in the array (from 0 inclusive to range exclusive)
		 * @return the generated array of random doubles
		 */
		
		public static double[] generateRandomDoubleArray(int length,double range){
			Random random=new Random();
			double[] arr=new double[length];
			for(int i=0;i<length;i++){
				arr[i]=random.nextDouble()*range;
			}
			return arr;
		}
		
		/**
		 * Generates an array of random BigIntegers with the specified length and bit count.
		 * @param length the length of the array
		 * @param bitCount the bit count of the BigIntegers in the array
		 * @return the generated array of random BigIntegers
		 */
		
		public static BigInteger[] generateRandomBigIntegerArray(int length,int bitCount){
			Random random=new Random();
			BigInteger[] arr=new BigInteger[length];
			for(int i=0;i<length;i++){
				arr[i]=new BigInteger(bitCount,random);
			}
			return arr;
		}
}