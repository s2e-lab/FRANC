import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID28{
	/**
	* Split the given sequence with the given delimiter and return list of values.
	*/
	public static java.util.List<String> split(String sequence, String delimiter){
			String[] splitValues = sequence.split(delimiter);
	return Arrays.asList(splitValues);
}

/**
 * Get the sum of the diagonal values of a number spiral starting with 1 at the center and increasing in a clockwise direction.
 */
public static int sumDiagonalValues(int size) {
    int sum = 1; // start with the center value
    int currentValue = 1; // initialize the current value
    int sideLength = 3; // initialize the side length

    while (sideLength <= size) {
        // add the four corner values to the sum
        for (int i = 0; i < 4; i++) {
            currentValue += sideLength - 1; // the next corner value
            sum += currentValue;
        }
        sideLength += 2; // increment the side length
    }
    return sum;
}

public static void main(String[] args){
	int size = 1001;
	int diagonalSum = sumDiagonalValues(size);
	System.out.println("The sum of diagonal values in a " + size + " x " + size + " number spiral is " + diagonalSum);
}
}