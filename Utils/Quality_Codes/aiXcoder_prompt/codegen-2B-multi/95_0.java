import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID95{
	/**
	* Compare two java objects for equality.
	*/
	public static boolean equals(Object o1, Object o2){
		if (o1 == null && o2 == null){
			return true;
		} else if ((o1 == null || o2 == null) && o1!= o2){
			return false;
		} else {
			return o1.equals(o2);
		}
	}	

	public static void main(String[] args){
		String fileContents = "1\t8\tabcdefgh\t12\t32\t43\t53\t";
		Scanner input = null;
}
}