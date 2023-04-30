import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID164{
	/**
	* Reverse a Map into a ValueSetMap, where each original value is mapped to the set of all its original keys.
	*/
	public static <K, V> Map<V, Set<K> > reverseMapIntoValueSetMap(Map<K, V> map){
		Set<K> set = new HashSet<K>(map.keySet());
		Map<V, Set<K>> valueSetMap = new HashMap<V, Set<K>>();
		
}
}