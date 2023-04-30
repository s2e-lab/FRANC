import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID164{
	/**
	* Reverse a Map into a ValueSetMap, where each original value is mapped to the set of all its original keys.
	*/
	public static <K, V> Map<V, Set<K> > reverseMapIntoValueSetMap(Map<K, V> map){
		Map<V, Set<K> > result = new HashMap<>();
		for(Map.Entry<K, V> entry : map.entrySet()){
			V value = entry.getValue();
			if(result.containsKey(value)){
				result.get(value).add(entry.getKey());
			}else{
				Set<K> set = new HashSet<>();
				set.add(entry.getKey());
				result.put(value, set);
			}
		}

		return result;
	
}
}