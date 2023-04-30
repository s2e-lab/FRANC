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

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		Map<String, HashSet<Integer>> map = new HashMap<String, HashSet<Integer>>();

		while((line = br.readLine()) != null){
			String[] parts = line.split(":");

			if(parts.length == 1){
				map.remove(parts[0]);
			}else{
				String[] values = parts[1].split(",");
				for(int i=0; i<values.length; i++){
					addToSet(map, parts[0], Integer.parseInt(values[i]));
				}
			}
		}

		List<String> keys = new ArrayList<String>(map.keySet());
		Collections.sort(keys);

		for(String key : keys){
			StringBuilder sb = new StringBuilder();
			List<Integer> values = new ArrayList<Integer>(map.get(key));
			Collections.sort(values);

			for(Integer value : values){
				sb.append(value).append(",");
			}

			sb.deleteCharAt(sb.length()-1);
			System.out.println(key + ":" + sb.toString());
		}
	}
}