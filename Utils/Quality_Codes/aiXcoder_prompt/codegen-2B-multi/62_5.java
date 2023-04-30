import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID62{
	/**
	* Calculates combinatorial number C(n,m). 
	*/
	public static int combinatorial(int n, int m){
		int sum = 1;
		for (int i=1; i<=n; i++){
			if (i < m){
				sum *= (i+1);
			}
			else{ sum += (m - i);
			}
		}
		return sum;
	}



	public static void main(String[] args) throws Exception {
		BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter outfile = new BufferedWriter(new OutputStreamWriter(System.out));

}
}