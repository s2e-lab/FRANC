import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID123{
	/**
	* Returns maximum possible integer, less or equal than oldValue, divisible by quantum.
	*/
	public static int floor(int x, int quantum){
		if(quantum == 0) quantum += 1;
		while(x >= quantum) x = x - quantum;
		return x;
	}

	public static void main(String[] args) throws IOException{
		FastScanner scanner = new FastScanner(new InputStreamReader(System.in));
		int testcases=scanner.nextInt();
}
}