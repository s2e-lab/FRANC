import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID48{
	/**
	* Adds all of the elements in collection to the Set.
	*/
	public static void addAll(Set<Integer> set, Collection<Integer> collection){
			for (Iterator i = collection.iterator(); i.hasNext(); )
			{
				Integer integer = (Integer) i.next();
				set.add(integer);
			}
	}
}