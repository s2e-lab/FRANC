import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID48{
	/**
	* Adds all of the elements in collection to the Set.
	*/
	public static void addAll(Set<Integer> set, Collection<Integer> collection){
			for (Integer integer : collection) {
			set.add(integer);
		}
	}
	
	/**
	* Returns a new Set that contains all elements that are in set1 or set2.
	*/
	public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2){
		Set<Integer> resultSet = new HashSet<Integer>();
		
		resultSet.addAll(set1);
		resultSet.addAll(set2);
		
		return resultSet;
	}
	
	/**
	* Returns a new Set that contains all elements that are in both set1 and set2.
	*/
	public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2){
		Set<Integer> resultSet = new HashSet<Integer>();
		
		for(Integer integer : set1){
			if(set2.contains(integer)){
				resultSet.add(integer);
			}
		}
		
		return resultSet;
	}
	
	/**
	* Returns a new Set that contains all elements that are in set1 but not in set2.
	*/
	public static Set<Integer> difference(Set<Integer> set1, Set<Integer> set2){
		Set<Integer> resultSet = new HashSet<Integer>();
		
		for(Integer integer : set1){
			if(!set2.contains(integer)){
				resultSet.add(integer);
			}
		}
		
		return resultSet;
	}
	
	/**
	* Returns the sum of the squares of the first n positive integers.
	*/
	public static BigInteger sumOfSquares(int n){
		BigInteger result = BigInteger.ZERO;
		
		for(int i=1; i<=n; i++){
			BigInteger intValue = new BigInteger(Integer.toString(i));
			BigInteger squareValue = intValue.multiply(intValue);
			result = result.add(squareValue);
		}
		
		return result;
	}
	
	/**
	* Returns the last ten digits of the sum of the one to one hundred thousandth power.
	*/
	public static String getLastTenDigits(){
		BigInteger result = BigInteger.ONE;
		BigInteger modValue = new BigInteger("10000000000");
		
		for(int i=1; i<=1000; i++){
			result = result.multiply(BigInteger.valueOf(i)).mod(modValue);
		}
		
		return result.toString();
	}
	
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(1,2,3,4,5));
}
}