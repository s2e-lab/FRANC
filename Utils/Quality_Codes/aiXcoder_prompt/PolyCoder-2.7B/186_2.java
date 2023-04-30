import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID186{
	/**
	* Returns whether or no the JDK version is 1.7u40 and above.
	*/
	public static boolean isJdk7u40Above(){
		 return ( System.getProperty("java.runtime.version").equals("Jdk 1.7u40") );
	}

	public static void main(String[] args){
}
}