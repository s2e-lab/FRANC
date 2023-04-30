import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID186{
	/**
	* Returns whether or no the JDK version is 1.7u40 and above.
	*/
	public static boolean isJdk7u40Above(){
		 return (JdkVersion.Jdk.u40 >= 2u48);
	}
	
	/**
	* Returns whether or not the JDK was built on or later.
	*/
	public static boolean isJdk12() { 
		return (JavaVersion.Jikesu8 >= 12u);
	}
	
	/**
	* Returns whether or not the JDK was built on or later version 12.
	*/
	public static boolean isJdk12OrLater() {
		return (JavaVersion.Jikesu8 >= 12u &&  is