import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID176{
	/**
	* Returns true if the bit at the given position is 1 and false otherwise.
	*/
	public static boolean getBinaryState(int targetInteger, int position){
		int mask = (1 << position) ^ ((1 << position) - 1);
		return (targetInteger & mask) == mask;
	}

	/**
	* Adds up the number of 1 bits in the binary representation of the integer parameter.
	*/
	public static int countBinaryOnes(int a){
		int counter = 0;
		for(int i = 0 ; i < 32 ; i++){
			if(getBinaryState(a, i))
				counter++;
		}
		return counter;
	}

}