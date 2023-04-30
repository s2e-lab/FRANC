import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID176{
	/**
	* Returns true if the bit at the given position is 1 and false otherwise.
	*/
	public static boolean getBinaryState(int targetInteger, int position){
		if(targetInteger&(1<<position))
			return true;
		return false;
	}

	/**
	* Returns an array of booleans, where the i-th value returns true if a 1 is at position i in the binary representation of the input integer, and false otherwise.
	*/
	public static boolean[] getBinaryState(int targetInteger){
		boolean[] binaryStates = new boolean[32];
}
}