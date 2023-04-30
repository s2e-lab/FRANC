import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID176{
	/**
	* Returns true if the bit at the given position is 1 and false otherwise.
	*/
	public static boolean getBinaryState(int targetInteger, int position){
		if (position == 0 || position >= targetInteger){
			return false;
		}
		return 1 == (targetInteger % 2);
	}
	
    /*
     * Original code: https://www.code-lexer.com/
     * Original author: @tsubikain
     */

    public int[] findBinarySequenceOnASimmetricPath(int nValue, int limit) {
        int range = 2*limit, len = 0;
        boolean[] bits = new boolean[(2*limit)+1];

}
}