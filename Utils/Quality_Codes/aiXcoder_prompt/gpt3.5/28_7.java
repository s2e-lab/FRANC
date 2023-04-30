import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID28{
	/**
	* Split the given sequence with the given delimiter and return list of values.
	*/
	public static java.util.List<String> split(String sequence, String delimiter){
			StringTokenizer tokenizer = new StringTokenizer(sequence, delimiter);
			java.util.List<String> values = new java.util.ArrayList<String>();
			while(tokenizer.hasMoreTokens()){
				values.add(tokenizer.nextToken());
			}
			return values;
		}
		
	public static void main(String[] args) throws Exception{
		java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		
		// read the number of test cases
		int t = Integer.parseInt(br.readLine().trim());
		
		while(t-- > 0){
			// read the input values for this test case
			String input = br.readLine().trim();
			String delimiter = br.readLine().trim();
			
			// split the input sequence with the given delimiter
			java.util.List<String> values = split(input, delimiter);
			
			// print the output for this test case
			for(String value : values){
				System.out.println(value);
			}
		}
	}
}