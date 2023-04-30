import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID48{
	/**
	* Adds all of the elements in collection to the Set.
	*/
	public static void addAll(Set<Integer> set, Collection<Integer> collection){
			Collection<Integer> result = new ArrayList<Integer>(collection);
			result.addAll(set);
			result = Collections.unmodifiableCollection(result);
			set = Collections.unmodifiableSet(result);
	}
}