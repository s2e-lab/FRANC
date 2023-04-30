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
		}else{
			HashSet<Integer> set = new HashSet<Integer>();
			set.add(value);
			map.put(key, set);
		}
	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); // number of logs
		in.nextLine(); // read the end of the line

		Map<String, HashSet<Integer>> logMap = new HashMap<String, HashSet<Integer>>();
		// read each log and get the indices of each word
		for(int i=0; i<n; i++){
			String log = in.nextLine();
			String[] words = log.split("\\s");
			for(int j=0; j<words.length; j++){
				String word = words[j];
				if(!word.matches("\\d+")){
					addToSet(logMap, word, i+1);
				}
			}
		}

		// print the logs that contain the given words
		int q = in.nextInt(); // number of queries
		in.nextLine(); // read the end of the line
		for(int i=0; i<q; i++){
			String query = in.nextLine();
			if(logMap.containsKey(query)){
				HashSet<Integer> set = logMap.get(query);
				System.out.print(set.size() + " ");
				for(Integer index : set){
					System.out.print(index + " ");
				}
				System.out.println();
			}else{
				System.out.println("0");
			}
		}
	}
} 
//End of code.