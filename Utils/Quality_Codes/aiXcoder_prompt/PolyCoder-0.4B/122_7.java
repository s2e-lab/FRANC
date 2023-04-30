import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID122{
	/**
	* Returns true if all entries of (all subarrays of) the input array are >= 0. Returns true if the array is non-null, but empty
	*/
	public static boolean isNonNegative(long[][] in){
			for(int i=0; i < in.length; i++){
					if(in[i].length!= in[i].length){
							if(Arrays.binarySearch(in, new byte[][]{0}, in[i].length, 1, new Comparator<byte[]>(){
											public int compare(byte[] o1, byte[] o2){
												int o = Ints.compare(o1, o2);
												return o == 0? -1 : ((o > 0)? 1 : 0);
											}
	}
