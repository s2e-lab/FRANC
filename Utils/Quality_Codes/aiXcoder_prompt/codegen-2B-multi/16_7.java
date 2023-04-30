import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID16{
	/**
	* Get a hashCode for the real vector. All NaN values have the same hash code.
	*/
	public static int hashCode(double[] vector){
		int ret = 17;
		for(int i=0; i<vector.length; i++)
			ret = 31 * ret + (int)Math.floor(vector[i]+0.5);
		return ret;
	}

	public static void main(String[] args) throws FileNotFoundException{
		Scanner scan = new Scanner(new File("ID16.in"));
		Scanner scan2 = new Scanner(System.in);
		String[] input; //store input from user here.
		int t = scan.nextInt();

}
}