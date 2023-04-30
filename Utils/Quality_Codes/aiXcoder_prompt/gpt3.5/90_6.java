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
		} else {
			HashSet<Integer> set = new HashSet<Integer>();
			set.add(value);
			map.put(key, set);
		}
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		// Create a HashMap to store names and their IDs
		Map<String, Integer> idMap = new HashMap<String, Integer>();
		// Create a HashMap to store course codes and their students' IDs
		Map<String, HashSet<Integer>> courseMap = new HashMap<String, HashSet<Integer>>();

		for(int i=0; i<n; i++){
			String command = sc.next();
			if(command.equals("register")){
				String name = sc.next();
				int id = sc.nextInt();
				idMap.put(name, id);
			} else if(command.equals("enroll")){
				String course = sc.next();
				String[] names = sc.nextLine().trim().split(" ");
				for(String name : names){
					int id = idMap.get(name);
					addToSet(courseMap, course, id);
				}
			} else if(command.equals("list")){
				String course = sc.next();
				// Sort the list of IDs in ascending order
				List<Integer> sortedIds = new ArrayList<Integer>(courseMap.get(course));
				Collections.sort(sortedIds);
				for(Integer id : sortedIds){
					// Find the name associated with the ID and print it
					for(Map.Entry<String, Integer> entry : idMap.entrySet()){
						if(entry.getValue().equals(id)){
							System.out.println(entry.getKey());
							break;
						}
					}
				}
			}
		}
	}
}