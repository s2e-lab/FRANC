import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID48{
	/**
	* Adds all of the elements in collection to the Set.
	*/
	public static void addAll(Set<Integer> set, Collection<Integer> collection){
			set.addAll(collection);
	}

	/**
	* Returns the sum of all the elements in the Set.
	*/
	public static int sum(Set<Integer> set){
		int sum = 0;
		for(int num : set){
			sum += num;
		}
		return sum;
	}

	/**
	* Returns the product of all the elements in the Set.
	*/
	public static BigInteger product(Set<Integer> set){
		BigInteger product = BigInteger.ONE;
		for(int num : set){
			product = product.multiply(BigInteger.valueOf(num));
		}
		return product;
	}

	/**
	* Returns the maximum element in the Set.
	*/
	public static int max(Set<Integer> set){
		if(set.isEmpty()){
			throw new NoSuchElementException("set is empty");
		}
		int maxNum = Integer.MIN_VALUE;
		for(int num : set){
			if(num > maxNum){
				maxNum = num;
			}
		}
		return maxNum;
	}

	/**
	* Returns the minimum element in the Set.
	*/
	public static int min(Set<Integer> set){
		if(set.isEmpty()){
			throw new NoSuchElementException("set is empty");
		}
		int minNum = Integer.MAX_VALUE;
		for(int num : set){
			if(num < minNum){
				minNum = num;
			}
		}
		return minNum;
	}

	public static void main(String[] args){
		Set<Integer> mySet = new HashSet<Integer>();
		mySet.add(3);
		mySet.add(4);
		mySet.add(2);
		mySet.add(1);
		mySet.add(5);

		System.out.println("Set: " + mySet);

		System.out.println("Sum: " + sum(mySet));
		System.out.println("Product: " + product(mySet));
		System.out.println("Max: " + max(mySet));
		System.out.println("Min: " + min(mySet));

		Collection<Integer> myCollection = new ArrayList<Integer>();
		myCollection.add(6);
		myCollection.add(7);
		myCollection.add(8);

		addAll(mySet, myCollection);

		System.out.println("Set after adding collection: " + mySet);
		System.out.println("Sum: " + sum(mySet));
		System.out.println("Product: " + product(mySet));
		System.out.println("Max: " + max(mySet));
		System.out.println("Min: " + min(mySet));
	}
}