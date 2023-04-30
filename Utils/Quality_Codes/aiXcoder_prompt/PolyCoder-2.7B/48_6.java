import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID48{
	/**
	* Adds all of the elements in collection to the Set.
	*/
	public static void addAll(Set<Integer> set, Collection<Integer> collection){
		 Iterator<Integer> iterator = collection.iterator();
		 while (iterator.hasNext()){
			 Integer integer = iterator.next();
			 set.add(integer);
		  }		

}
}