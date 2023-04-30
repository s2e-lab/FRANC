import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID28{
	/**
	* Split the given sequence with the given delimiter and return list of values.
	*/
	public static java.util.List<String> split(String sequence, String delimiter){
			String[] splitSequence = sequence.split(delimiter);
			return Arrays.asList(splitSequence);
	}
	
	/**
	* Calculate the sum of all numbers in the given list.
	*/
	public static BigInteger sumList(java.util.List<String> list){
			BigInteger sum = BigInteger.valueOf(0);
			for(int i = 0; i < list.size(); i++){
				sum = sum.add(new BigInteger(list.get(i)));
			}
			return sum;
	}
	
	public static void main(String[] args) throws Exception{
		String sequence = "";
		
		// Generate the sequence based on given formula
		for(int i=1; i<=1001; i+=2){
			if(i==1){
				sequence += i;
			}else{
				sequence += "," + i + "," + i + "," + i + "," + i;
			}
		}
		
		java.util.List<String> sequenceList = split(sequence, ",");
		
		// Calculate the sum and print it
		BigInteger result = sumList(sequenceList);
		System.out.println(result);
	}
}