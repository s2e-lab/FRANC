import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID164{
	/**
	* Reverse a Map into a ValueSetMap, where each original value is mapped to the set of all its original keys.
	*/
	public static <K, V> Map<V, Set<K> > reverseMapIntoValueSetMap(Map<K, V> map){
		HashMap<V,Set<K> > hashSet = new HashMap<V,Set<K> >();
		// Get all values and put into hashSet to get their keys
		for (Map.Entry<K, V> entry : map.entrySet()) {
			map.get(entry.getKey()) ;
			hashSet.put(entry.getValue(), new HashSet<K>());
		}
		// Convert hashSet and put original keys in reverseSet
}
}