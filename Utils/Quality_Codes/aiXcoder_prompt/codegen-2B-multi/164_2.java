import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID164{
	/**
	* Reverse a Map into a ValueSetMap, where each original value is mapped to the set of all its original keys.
	*/
	public static <K, V> Map<V, Set<K> > reverseMapIntoValueSetMap(Map<K, V> map){
		Map<V, Set<K> > result = new HashMap<V, Set<K> >();
		for (Map.Entry<K, V> entry : map.entrySet())
			result.put(entry.getValue(), new HashSet<K>());		
		for (Map.Entry<K, V> entry : map.entrySet())
			for (int i = 0; i < entry.getValue().length(); i++){
				result.get(entry.getValue()).add( entry.getKey() );
			}
}
}