import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID164{
	/**
	* Reverse a Map into a ValueSetMap, where each original value is mapped to the set of all its original keys.
	*/
	public static <K, V> Map<V, Set<K> > reverseMapIntoValueSetMap(Map<K, V> map){
		LinkedHashMap<V, Set<K> > ret = new LinkedHashMap<V, Set<K> >();
		Map<K, V> copy = new HashMap<K, V>(map);
		Map<V, Collection<K> > reverseDict = reverse(copy);
}
}