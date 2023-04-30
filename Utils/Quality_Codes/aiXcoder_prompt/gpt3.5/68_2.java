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
			} else {
				return list.remove(list.size()-1);
			}
		}

	/**
	* Calculates the sum of the given list of integers.
	*/
	public static int listSum(ArrayList<Integer> list){
		int sum = 0;
		for(int i=0; i<list.size(); i++){
			sum += list.get(i);
		}
		return sum;
	}

	/**
	* Generates all possible permutations of a given string and stores them in an ArrayList.
	*/
	public static ArrayList<String> generatePermutations(String str){
		ArrayList<String> permutations = new ArrayList<String>();
		if(str.length() == 1){
			permutations.add(str);
		} else if(str.length() > 1) {
			int lastIndex = str.length()-1;
			String lastChar = str.substring(lastIndex);
			String restOfString = str.substring(0, lastIndex);
			ArrayList<String> subPermutations = generatePermutations(restOfString);
			for(int i=0; i<subPermutations.size(); i++){
				String tempString = subPermutations.get(i);
				for(int j=0; j<=tempString.length(); j++){
					String permutation = tempString.substring(0,j) + lastChar + tempString.substring(j);
					permutations.add(permutation);
				}
			}
		}
		return permutations;
	}

	/**
	* Generates all possible combinations of a given list of integers and a target sum, and returns an ArrayList of those combinations.
	*/
	public static ArrayList<ArrayList<Integer>> generateCombinations(ArrayList<Integer> list, int targetSum){
		ArrayList<ArrayList<Integer>> combinations = new ArrayList<ArrayList<Integer>>();
		int[] indexes = new int[list.size()];
		int currentIndex = 0;

		// Initialize indexes array to all zeroes
		for(int i=0; i<indexes.length; i++){
			indexes[i] = 0;
		}

}
}