import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID48{
	/**
	* Adds all of the elements in collection to the Set.
	*/
	public static void addAll(Set<Integer> set, Collection<Integer> collection){
			for(Integer element : collection){
				set.add(element);
			}
		}

	/**
	* Finds the sum of all the numbers from 1 to n raised to the power of itself.
	*/
	public static BigInteger findSelfPowers(int n){
		BigInteger sum = BigInteger.valueOf(0); //initialize sum to 0
		for(int i=1;i<=n;i++){
			sum = sum.add(BigInteger.valueOf(i).pow(i)); //add i^i to the sum
		}
		return sum;
	}

	public static void main(String[] args){
		Set<Integer> set = new HashSet<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		addAll(set, list);
		System.out.println(set);

		//Find the sum of all the numbers from 1 to 1000 raised to the power of itself
		System.out.println(findSelfPowers(1000));
	}
}