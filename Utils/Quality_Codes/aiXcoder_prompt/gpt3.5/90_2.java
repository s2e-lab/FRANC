import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID90{
	/**
	* Add the value to the HashSet given by map.get(key), creating a new HashSet if the HashSet is null
	*/
	public static void addToSet(Map<String, HashSet<Integer>> map, String key, Integer value){
			if(map.containsKey(key)){
				map.get(key).add(value);
			}
			else{
				HashSet<Integer> set = new HashSet<Integer>();
				set.add(value);
				map.put(key, set);
			}
		}

	/**
	* Returns the index of the first occurrence of the target within the array, or -1 if not found
	*/
	public static int binarySearch(int[] arr, int target){
		int left = 0;
		int right = arr.length-1;
		while(left <= right){
			int mid = left + (right-left)/2;
			if(arr[mid] == target){
				return mid;
			}
			else if(arr[mid] < target){
				left = mid+1;
			}
			else{
				right = mid-1;
			}
		}
		return -1;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// Taking inputs from user
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[m];
		Map<String, HashSet<Integer>> aMap = new HashMap<String, HashSet<Integer>>();
		Map<String, HashSet<Integer>> bMap = new HashMap<String, HashSet<Integer>>();

		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
			String str = Integer.toBinaryString(a[i]);
			addToSet(aMap, str, i+1);
		}
		for(int i=0; i<m; i++){
			b[i] = sc.nextInt();
			String str = Integer.toBinaryString(b[i]);
			addToSet(bMap, str, i+1);
		}

		// Finding common binary values in aMap and bMap
		List<String> commonBin = new ArrayList<String>();
		for(String str: aMap.keySet()){
			if(bMap.containsKey(str)){
				commonBin.add(str);
			}
		}

		// Finding indexes of common binary values in a and b arrays
		List<Integer> aIndexList = new ArrayList<Integer>();
		List<Integer> bIndexList = new ArrayList<Integer>();
		for(String str: commonBin){
			for(Integer i: aMap.get(str)){
				aIndexList.add(i);
			}
			for(Integer i: bMap.get(str)){
				bIndexList.add(i);
			}
		}

		// Sorting the index
}
}