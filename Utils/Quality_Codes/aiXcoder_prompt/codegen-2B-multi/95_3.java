import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID95{
	/**
	* Compare two java objects for equality.
	*/
	public static boolean equals(Object o1, Object o2){
		if (o1==o2) return true;
		if (((o1 == null) && (o2!= null))||(o1!= null &&!o1.equals(o2))) //o1.equals()
			return false;
		return true;
	}

	/*
	* Convert a string into a number. Numeric format must be a double precision floating point number.
	*/
	private static double parseNum(String in){
		double result=Double.NaN;

}
}