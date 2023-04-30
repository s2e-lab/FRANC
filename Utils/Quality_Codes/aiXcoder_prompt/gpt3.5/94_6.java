import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID94{
	/**
	* Choose a pseudo-random element from the specified array.
	*/
	public static int random(int[] array){
			Random rand = new Random();
int index = rand.nextInt(array.length);
return array[index];
	}

	/**
	* Main method which takes input from console and generates a random number
	* from the input values.
	*/
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Taking input values
		String[] inputVals = br.readLine().trim().split("\\s+");

		// Converting string input to integer array
		int[] valsArr = new int[inputVals.length];
		for(int i=0; i<inputVals.length; i++){
			valsArr[i] = Integer.parseInt(inputVals[i]);
		}

		// Generating random number from the input values
		int randomNum = random(valsArr);
		System.out.println(randomNum);
	}
}