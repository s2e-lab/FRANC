import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID72{
	/**
	* Create an instance of a clazz using the current thread context ClassLoader.
	*/
	public static <T> T newInstance(Class<T> clazz){
			try{
					return clazz.newInstance();
			}catch(Exception e){
					//Ignore
			}
		    return null;
	}
	public static <T> void main(String args[]){
		File tempFile = null;
		final File f  = new File(args[0]);
}
}