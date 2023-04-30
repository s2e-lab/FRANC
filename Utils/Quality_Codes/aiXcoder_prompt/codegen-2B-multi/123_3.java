import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID123{
	/**
	* Returns maximum possible integer, less or equal than oldValue, divisible by quantum.
	*/
	public static int floor(int x, int quantum){
		if (x == 0) return 0;
		return (x + quantum - 1) / quantum;
	}

	// Time:  O(log(n))
	// Space: O(1)
}