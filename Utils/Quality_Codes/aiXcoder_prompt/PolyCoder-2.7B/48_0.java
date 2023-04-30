import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID48{
	/**
	* Adds all of the elements in collection to the Set.
	*/
	public static void addAll(Set<Integer> set, Collection<Integer> collection){
			if (collection == null) throw new IllegalArgumentException( "Collection cannot be null." );
			for( int value:collection){
				set.add(value);
			}
	}
}
/*
	NOTE:
	The following classes can be used for ID4-64:
	java.util.HashSet
	java.util.HashMap
	java.util.Hashtable
	java.lang.String
*/
class ID48_long{
	/**
	* Adds all the elements in collection to the Set.
	*/
}