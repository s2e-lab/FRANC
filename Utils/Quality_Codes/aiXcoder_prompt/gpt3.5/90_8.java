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

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Map<String, HashSet<Integer>> map = new HashMap<String, HashSet<Integer>>();

		for(int i=1; i<=n; i++){
			String id = sc.next();
			String country = id.substring(0, 3);
			addToSet(map, country, i);
		}

		for(Map.Entry<String, HashSet<Integer>> entry : map.entrySet()){
			String country = entry.getKey();
			HashSet<Integer> idSet = entry.getValue();
			System.out.println(country + " " + idSet.size());
		}
	}
}