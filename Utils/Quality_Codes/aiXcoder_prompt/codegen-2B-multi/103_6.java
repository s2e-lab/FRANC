import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID103{
	/**
	* Returns true if two doubles are considered equal. Tests if the absolute difference between the two doubles has a difference less then a given double (epsilon)Returns true if two doubles are considered equal. Tests if the absolute difference between the two doubles has a difference less then a given double (epsilon)
	*/
	public static boolean equals(double a, double b, double epsilon){
		return (Math.abs(a-b) < epsilon);
	}
/**
* Converts a int to a double
*/
	public static double intToDouble(int i){
		return (double)i;
	}
}