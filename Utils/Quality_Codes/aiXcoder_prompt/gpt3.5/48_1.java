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
	* Computes and returns the sum of all the integers in the Set that are divisible by 3 or 5.
	*/
	public static int findSum(Set<Integer> set){
		int sum=0;
		for(Integer i: set){
			if(i%3==0 || i%5==0){
				sum+=i;
			}
		}
		return sum;
	}

	public static void main(String[] args){
		Set<Integer> set = new HashSet<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements you want to add to the set:");
		int n = sc.nextInt();
		System.out.println("Enter the elements:");
		for(int i=0; i<n; i++){
			int num = sc.nextInt();
			set.add(num);
			list.add(num);
		}
		System.out.println("Sum of all multiples of 3 or 5 in the set: "+findSum(set));
		System.out.println("Set: "+set);
		System.out.println("List: "+list);		
	}
}