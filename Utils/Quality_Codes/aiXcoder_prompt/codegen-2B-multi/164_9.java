import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID164{
	/**
	* Reverse a Map into a ValueSetMap, where each original value is mapped to the set of all its original keys.
	*/
	public static <K, V> Map<V, Set<K> > reverseMapIntoValueSetMap(Map<K, V> map){
		Map<V, Set<K> > retMap = new HashMap<>();

		for(K k : map.keySet()){
			retMap.put(map.get(k), new HashSet<>(map.keySet()));
		}
		return retMap;
	}

	private static <T> void printMap(Map<T, List<T>> map, Iterable<T> items) {
		if(map == null || map.isEmpty()) System.out.println("Empty.");
}
}