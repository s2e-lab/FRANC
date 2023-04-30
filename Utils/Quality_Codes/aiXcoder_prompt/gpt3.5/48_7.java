import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID48{
	/**
	* Adds all of the elements in collection to the Set.
	*/
	public static void addAll(Set<Integer> set, Collection<Integer> collection){
			for(Integer num : collection) {
			set.add(num);
		}
	}
	
	/**
	* Computes the sum of squares of all integers from 1 to n.
	*/
	public static BigInteger sumOfSquares(int n) {
		BigInteger sum = BigInteger.ZERO;
		for(int i=1; i<=n; i++) {
			BigInteger num = BigInteger.valueOf(i);
			sum = sum.add(num.multiply(num));
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Set<Integer> nums = new HashSet<>();
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		addAll(nums,list);
		System.out.println(nums);
		BigInteger sum = sumOfSquares(1000);
		System.out.println(sum);
	}
}