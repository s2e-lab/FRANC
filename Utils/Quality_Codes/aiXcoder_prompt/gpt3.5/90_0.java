import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID90{
	/**
	* Add the value to the HashSet given by map.get(key), creating a new HashSet if the HashSet is null
	*/
	public static void addToSet(Map<String, HashSet<Integer>> map, String key, Integer value){
			if(map.get(key) == null){
				map.put(key, new HashSet<Integer>());
			}
			map.get(key).add(value);
		}
		
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Map<String, HashSet<Integer>> map = new HashMap<String, HashSet<Integer>>();
		
		int n = in.nextInt();
		
		for(int i=0; i<n; i++){
			String name = in.next();
			Integer id = in.nextInt();
			
			addToSet(map, name, id);
		}
		
		int q = in.nextInt();
		
		for(int i=0; i<q; i++){
			String name = in.next();
			
			if(map.get(name) != null){
				HashSet<Integer> ids = map.get(name);
				for(Integer id : ids){
					System.out.print(id + " ");
				}
				System.out.println();
			}
			else{
				System.out.println("-1");
			}
		}
	}
}