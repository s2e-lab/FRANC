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
		for (Map.Entry<K, V> entry : map.entrySet()) {
			result.put(entry.getValue(), new HashSet<K>());
			for (K k : map.keySet()) {
				if (entry.getValue().equals(map.get(k))) {
					result.get(entry.getValue()).add(k);
				}
			}
		}
		return result;
	}
	
	
}