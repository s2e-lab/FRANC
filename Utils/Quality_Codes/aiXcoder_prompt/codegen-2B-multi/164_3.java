import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID164{
	/**
	* Reverse a Map into a ValueSetMap, where each original value is mapped to the set of all its original keys.
	*/
	public static <K, V> Map<V, Set<K> > reverseMapIntoValueSetMap(Map<K, V> map){
		Map<V, Set<K> > setMap = new HashMap<V, Set<K> >();
		Set<K> setKeys = map.keySet();
		for (K key : setKeys) setMap.put(map.get(key), new HashSet<K>());
		for (K key : setKeys){
			setMap.get(map.get(key)).add(key);
		}
		return setMap;
	}
	public static <K, V> void printMap(Map<K, V> map){
		
}
}