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
			}
			int lastIndex = list.size() - 1;
			String removedElement = list.get(lastIndex);
			list.remove(lastIndex);
			return removedElement;
		}
	
	/**
	* Finds the largest 16-digit number that can be formed by concatenating a permutation of the given digits.
	* Only consider permutations starting with the first digit.
	*/
	public static String findLargestPermutation(){
		// Initialize list with digits
		ArrayList<String> digits = new ArrayList<>(Arrays.asList("1","2","3","4","5","6","7","8","9","0","6","7","8","9","0","1"));
		
		// Store permutations in a priority queue to get maximum permutation easily
		PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<String>(){
			@Override
			public int compare(String s1, String s2){
				return s2.compareTo(s1);
			}
		});
		
		// Generate permutations
		permutations(digits, pq, "");
		
		// Get maximum permutation starting with first digit
		String maxPermutation = "";
		while(!pq.isEmpty()){
			String permutation = pq.poll();
			if(permutation.startsWith("6")){
				maxPermutation = permutation;
				break;
			}
		}
		
		return maxPermutation;
	}
	
	/**
	* Recursively generates all permutations of given digits and adds them to priority queue.
	*/
	public static void permutations(ArrayList<String> digits, PriorityQueue<String> pq, String prefix){
		if(digits.size() == 0){
			pq.add(prefix);
			return;
		}
		for(int i = 0; i < digits.size(); i++){
			String digit = digits.get(i);
			digits.remove(i);
			permutations(digits, pq, prefix + digit);
			digits.add(i, digit);
		}
	}
	
	public static void main(String[] args){
		System.out.println(findLargestPermutation());
	}
}