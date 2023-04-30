import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID68{
	/**
	* Removes and returns last element in list, return null if empty.
	*/
	public static String removeLast(ArrayList<String> list){
			if (list.isEmpty()) {
			return null; // return null if list is empty
		} else {
			return list.remove(list.size() - 1); // remove and return last element
		}
	}
	
	/**
	* Computes the sum of the digits of a given BigInteger.
	*/
	public static int digitSum(BigInteger n){
		int sum = 0;
		while (n.compareTo(BigInteger.ZERO) > 0) {
			sum += n.mod(BigInteger.TEN).intValue(); // add the last digit to the sum
			n = n.divide(BigInteger.TEN); // remove the last digit from the number
		}
		return sum;
	}
	
	/**
	* Main method
	*/
	public static void main(String[] args) throws java.lang.Exception{
		// input from file
		FileReader fr = new FileReader("input.txt");
		BufferedReader br = new BufferedReader(fr);
		
		// output to file
		FileWriter fw = new FileWriter("output.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		// initialize variables
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<BigInteger> values = new ArrayList<BigInteger>();
		
		String line = "";
		while ((line = br.readLine()) != null) {
			String[] split = line.split(",");
			names.add(split[0]);
			values.add(new BigInteger(split[1]));
		}
		
		// process values
		BigInteger totalSum = BigInteger.ZERO;
		while (!values.isEmpty()) {
			BigInteger n = new BigInteger(removeLast(values));
			totalSum = totalSum.add(n); // add to total sum
			int digitSum = digitSum(n); // compute digit sum
			int index = digitSum % names.size(); // compute index
			String name = names.get(index); // get name
			bw.write(name);
			bw.newLine();
		}
		
		// write total sum to output file
		bw.write(totalSum.toString());
		
		// close files and exit
		br.close();
		fr.close();
		bw.close();
		fw.close();
		System.exit(0);
	}
}