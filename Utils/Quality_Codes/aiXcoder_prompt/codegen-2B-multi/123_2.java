import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID123{
	/**
	* Returns maximum possible integer, less or equal than oldValue, divisible by quantum.
	*/
	public static int floor(int x, int quantum){
		for(int i=0; i<=quantum; ++i) if(x % i == 0) return x/i;
		return x;
	}

    public static void main(String[] args)
	{
		long test=1L;
		int quantum=21;

		System.out.println("== test "+++test+" == ");
}
}