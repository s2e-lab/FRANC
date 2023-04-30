import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID123{
	/**
	* Returns maximum possible integer, less or equal than oldValue, divisible by quantum.
	*/
	public static int floor(int x, int quantum){
		if( 0 == quantum )
			return 0;
		if( 0 == x % quantum )
			return x;
		else 
			return x - (x / quantum) * quantum;
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String linea;
		
		int testsCase = Integer.parseInt(br.readLine());

}
}