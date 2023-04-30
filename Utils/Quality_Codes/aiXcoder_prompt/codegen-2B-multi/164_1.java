import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID164{
	/**
	* Reverse a Map into a ValueSetMap, where each original value is mapped to the set of all its original keys.
	*/
	public static <K, V> Map<V, Set<K> > reverseMapIntoValueSetMap(Map<K, V> map){
		Map<V, Set<K> > res = new HashMap<>();
		for (Map.Entry<K, V> entry : map.entrySet()) {
			Set<K> keySet = res.get(entry.getValue());
			if (keySet == null) {
				keySet = new HashSet<>();
				res.put(entry.getValue(), keySet);
			}
			keySet.add(entry.getKey());
		}
		return res;
	}
}