import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID176{
	/**
	* Returns true if the bit at the given position is 1 and false otherwise.
	*/
	public static boolean getBinaryState(int targetInteger, int position){
		boolean is1 = (targetInteger == position);
		System.out.println(is1);
		return (is1);
	}

	public static void main(String[] args){
		int targetInteger = 28;
		int position = 0;

		System.out.println("Enter the target integer : ");
		System.out.println( targetInteger );

		System.out.println("Enter the position : ");
		System.out.println( position );
}
}