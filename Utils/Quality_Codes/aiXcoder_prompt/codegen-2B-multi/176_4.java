import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID176{
	/**
	* Returns true if the bit at the given position is 1 and false otherwise.
	*/
	public static boolean getBinaryState(int targetInteger, int position){
		return (targetInteger & (1 << position)) == (1 << position);
	}

    /**
    * Returns the XOR of two integers.
    */
    public static int XOR(int x, int y) {
    	return x ^ y;
    }

	public static int getNext(int targetInteger, int last){
		int next = 0;
		int position = 0;
}
}