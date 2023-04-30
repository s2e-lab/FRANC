import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID32{
	/**
	* Returns the minimum value in an array.
	*/
	public static int min(int[] array){
			int min = Integer.MAX_VALUE;
			for( int e : array) {
				if( e < min)
					min = e;
			}
			return min;
	}
		
}