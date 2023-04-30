import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID123{
	/**
	* Returns maximum possible integer, less or equal than oldValue, divisible by quantum.
	*/
	public static int floor(int x, int quantum){
		int result, div;
		result=x%quantum;
		div=quantum-result;
		return result+div;
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("#\n");
		bw.write("# M 1010 - Identify the digits.\n");
}
}