import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID164{
	/**
	* Reverse a Map into a ValueSetMap, where each original value is mapped to the set of all its original keys.
	*/
	public static <K, V> Map<V, Set<K> > reverseMapIntoValueSetMap(Map<K, V> map){
		Map<V, Set<K> > resultMap = new HashMap<V, Set<K> >();
		for(K key: map.keySet()){
			V val = map.get(key);
			Set<K> keys = resultMap.get(val);
			if(keys == null){
				keys = new HashSet<K>();
				resultMap.put(val, keys);
			}
			keys.add(key);
		}
		return resultMap;
	} 
	
}