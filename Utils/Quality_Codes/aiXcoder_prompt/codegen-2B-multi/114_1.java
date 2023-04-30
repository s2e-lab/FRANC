import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID114{
	/**
	* Check whether a file is actually a valid zip
	*/
	public static boolean isValidZip(File zip){
		Scanner scan=new Scanner(zip);
		scan.nextLine();
		return isValidZip(scan);
	}
    /**
	* Is the String a valid zip file?
	*/
	public static boolean isValidZip(String zip){
		return zip.toUpperCase().endsWith(".ZIP");
	}

    /**
	* Check whether a given int is a positive integer
	*/
	static boolean isPositive(int x){
		return x>0;
	}

}