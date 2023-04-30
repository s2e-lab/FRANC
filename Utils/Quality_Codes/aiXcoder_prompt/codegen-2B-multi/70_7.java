import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID70{
	/**
	* Calculate the elapsed time between two times specified in milliseconds.
	*/
	public static long elapsedTime(Calendar start, Calendar end){
		long startTime = start.getTimeInMillis();
		long endTime = end.getTimeInMillis();
		return endTime - startTime;
	}
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

}
}