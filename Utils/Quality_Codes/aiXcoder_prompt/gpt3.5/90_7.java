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
			HashSet<Integer> set = new HashSet<>();
			set.add(value);
			map.put(key, set);
		}
	}

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		Map<String, HashSet<Integer>> map = new HashMap<>();

		for(int i=0;i<n;i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			String id = st.nextToken();
			int score = Integer.parseInt(st.nextToken());

			addToSet(map, id, score);
		}

		int q = Integer.parseInt(br.readLine());

		for(int i=0;i<q;i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			String id = st.nextToken();
			if(!map.containsKey(id)){
				System.out.println("0");
			} else {
				HashSet<Integer> set = map.get(id);
				int min = Integer.parseInt(st.nextToken());
				int max = Integer.parseInt(st.nextToken());
				int count = 0;
				for(Integer score: set){
					if(score>=min && score<=max){
						count++;
					}
				}
				System.out.println(count);
			}
		}
	}
}