import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID68{
	/**
	* Removes and returns last element in list, return null if empty.
	*/
	public static String removeLast(ArrayList<String> list){
			if(list.isEmpty()){
			return null;
		}else{
			return list.remove(list.size()-1);
		}
	}

	/**
	* Gets the maximum number in the list of integers.
	*/
	public static int getMax(List<Integer> list){
		if(list.isEmpty()){
			throw new NoSuchElementException("List is empty");
		}
		int max = list.get(0);
		for(int i=1; i<list.size(); i++){
			if(list.get(i) > max){
				max = list.get(i);
			}
		}
		return max;
	}

	/**
	* Returns the factorial of a given number.
	*/
	public static BigInteger factorial(int num){
		BigInteger result = BigInteger.ONE;
		for(int i=1; i<=num; i++){
			result = result.multiply(BigInteger.valueOf(i));
		}
		return result;
	}

	/**
	* Main method for testing 
	*/
	public static void main(String[] args){
		// Test removeLast method
		ArrayList<String> names = new ArrayList<>();
		names.add("John");
		names.add("Mary");
		names.add("Bob");
		System.out.println(removeLast(names)); // should print "Bob"
		System.out.println(removeLast(names)); // should print "Mary"
		System.out.println(removeLast(names)); // should print "John"
		System.out.println(removeLast(names)); // should print "null"

		// Test getMax method
		List<Integer> numbers = Arrays.asList(3, 6, 1, 8, 2);
		System.out.println(getMax(numbers)); // should print 8

		// Test factorial method
		System.out.println(factorial(5)); // should print 120
		System.out.println(factorial(10)); // should print 3628800
	}
}