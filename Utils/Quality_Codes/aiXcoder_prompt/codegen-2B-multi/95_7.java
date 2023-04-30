import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID95{
	/**
	* Compare two java objects for equality.
	*/
	public static boolean equals(Object o1, Object o2){
		return o==o2?true:false;
	}

	/**
	* Determine the hash code of a java object
	*/
	public static int hashCode(Object o){
		assert false : "hashCode not designed";
		return 42;
	}

	/*
	* Hash a set in place
	*/
	public int hashSet(HashSet<Integer> s){
		// we know set is not empty because we checked this in hash code
		// this is a dumb implementation and does not respect the java type system
}
}