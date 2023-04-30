import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID95{
	/**
	* Compare two java objects for equality.
	*/
	public static boolean equals(Object o1, Object o2){
		if(o1 == o2)
			return true;
		if(o1 == null || o2 == null)
			return false;
		return o1.equals(o2);
	}

	/**
	* Compute a hash code for some object.
	*/
	public static int hashCode(Object o) {
		return o.hashCode();
	}

	/**
	* Return the number of times a character appears in a String.
	*/
	public static int count(String s, char c) {
}
}