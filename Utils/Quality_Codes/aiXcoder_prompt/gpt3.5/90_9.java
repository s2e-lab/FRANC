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

	/**
	* Main function to read input and print output
	*/
	public static void main(String[] args) throws Exception{

		// Reading input from console
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String inputStr = br.readLine();
		int n = Integer.parseInt(inputStr);

		// Initializing HashMap for storing data
		Map<String, HashSet<Integer>> map = new HashMap<String, HashSet<Integer>>();

		// Reading and processing entries
		for(int i=0; i<n; i++){
			String entry = br.readLine();
			String[] entryArr = entry.split(" ");

			String name = entryArr[0].trim();
			int id = Integer.parseInt(entryArr[1].trim());

			// Adding the entry to the map
			addToSet(map, name, id);
		}

		// Sorting the map keys
		List<String> sortedKeys = new ArrayList<String>(map.keySet());
		Collections.sort(sortedKeys);

		// Printing the result
		for(String key : sortedKeys){
			System.out.print(key+":");
			List<Integer> sortedIds = new ArrayList<Integer>(map.get(key));
			Collections.sort(sortedIds);
			for(Integer id : sortedIds){
				System.out.print(" "+id);
			}
			System.out.println();
		}
	}
}