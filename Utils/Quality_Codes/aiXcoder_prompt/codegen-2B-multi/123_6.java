import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID123{
	/**
	* Returns maximum possible integer, less or equal than oldValue, divisible by quantum.
	*/
	public static int floor(int x, int quantum){
		int i = (int)Math.floor( (Math.ceil(Math.abs(x)) -1) / quantum);
		return x <= 0? i: x <= quantum? Math.max(0, i -1) : i;
	}

	/**
	* Returns largest integer less than or equal to x, divisible by quantum.
	* @param quantum
	* @param x
	*/
	public static int ceil(int x, int quantum){
}
}