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
		return array[rand.nextInt(array.length)];
	}
	
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		// Read in input
		int[] nums = new int[n];
		for(int i=0;i<n;i++){
			nums[i]=in.nextInt();
		}

		// Choose a random element
		int randomElement = random(nums);

		// Output result
		System.out.println(randomElement);
	}
}