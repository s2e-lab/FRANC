import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID58{
	/**
	* Converts an int into an array of byte using the default (little endian, Lsb0) byte and bit ordering.
	*/
	public static byte[] intToByteArray(int value){
		int size = 4;
	        byte[] byteArray = new byte[size];
	        for (int i = 0; i < size; i++) {
	             int shiftSize = (size - 1 - i) * 8;
	             byteArray[i] = (byte)((value >>> shiftSize) & 0xff);
	        }
	        return byteArray;
	}

    	public static void main(String[] args) {
		String input_line = null;
		Scanner scanner = new Scanner(System.in);
}
}