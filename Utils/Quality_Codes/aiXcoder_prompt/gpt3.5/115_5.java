import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID115{
	/**
	* Parse a list of longs into strings.
	*/
	public static String[] toTimestampStrs(long[] timestamps){
			String[] timeStrings = new String[timestamps.length];
		for(int i=0;i<timestamps.length;i++){
			timeStrings[i] = String.valueOf(timestamps[i]);
		}
		return timeStrings;
	}   
	
	/**
	* Calculate the simple moving average of a list of doubles.
	*/
	public static double[] calculateSMA(double[] inputData, int window){
		if(window<=0){
			throw new IllegalArgumentException("Window length should be a positive integer");
		}
		if(inputData==null || inputData.length == 0){
			throw new IllegalArgumentException("Input data should not be empty");
		}
		double[] outputData = new double[inputData.length - window + 1];
		for(int i=0;i<outputData.length;i++){
			double sum=0.0;
			for(int j=0;j<window;j++){
				sum += inputData[i+j];
			}
			outputData[i] = sum/window;
		}
		return outputData;
	}
	
	/**
	* Count the number of occurrences of a target string in a list of strings.
	*/
	public static int countOccurrences(String[] inputStrings, String target){
		if(inputStrings==null || inputStrings.length == 0){
			throw new IllegalArgumentException("Input strings should not be empty");
		}
		int count=0;
		for(String str: inputStrings){
			if(str.equals(target)){
				count++;
			}
		}
		return count;
	}
	
	/**
	* Check if a given number is a prime number.
	*/
	public static boolean isPrime(int num){
		if(num<=1){
			return false;
		}
		if(num<=3){
			return true;
		}
		if(num%2==0 || num%3==0){
			return false;
		}
		for(int i=5;i*i<=num;i+=6){
			if(num%i == 0 || num%(i+2)==0){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
	}
}