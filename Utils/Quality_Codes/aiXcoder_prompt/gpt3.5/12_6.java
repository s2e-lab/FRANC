import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID12{
	/**
	* Retrieves the value by specified int index of the given List.
	*/
	public static String getValue(List<String> list, int index){
			String value = "";
		if(index >= 0 && index < list.size()){
			value = list.get(index);
		}
		return value;
	}
	
	/**
	* Computes the n-th triangular number using the formula (n*(n+1))/2.
	* Handles large integers using BigInteger class.
	*/
	public static BigInteger getNthTriangularNumber(int n){
		BigInteger b1 = BigInteger.valueOf(n);
		BigInteger b2 = BigInteger.valueOf(n+1);
		return b1.multiply(b2).divide(BigInteger.valueOf(2));
	}
	
	/**
	* Computes the number of divisors for the given number using brute-force method.
	*/
	public static int getNumberOfDivisors(BigInteger num){
		int count = 0;
		for(BigInteger i=BigInteger.valueOf(1); i.compareTo(num) <= 0; i = i.add(BigInteger.valueOf(1))){
			if(num.mod(i) == BigInteger.ZERO){
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args){
		
		// List to store generated triangular numbers
		List<String> triangularNums = new ArrayList<String>();
		
		// Generate and store triangular numbers until target number of divisors is found
		int targetDivisors = 500;
		int n = 1;
		while(true){
			BigInteger triangularNum = getNthTriangularNumber(n);
			int numDivisors = getNumberOfDivisors(triangularNum);
			if(numDivisors > targetDivisors){
				String value = triangularNum.toString();
				triangularNums.add(value);
				break;
			}else{
				String value = triangularNum.toString();
				triangularNums.add(value);
				n++;
			}
		}
		
		// Print the result
		System.out.println("First triangular number with over 500 divisors: " + getValue(triangularNums, 0));
		
	}
}