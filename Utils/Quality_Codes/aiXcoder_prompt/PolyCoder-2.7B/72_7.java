import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID72{
	/**
	* Create an instance of a clazz using the current thread context ClassLoader.
	*/
	public static <T> T newInstance(Class<T> clazz){
		 return clazz.getClassLoader().loadClass(clazz.getName()).asSubclass(clazz).newInstance();
	}
	
	/**
	* Write a value to the output stream, as a single byte. This method is needed
	* for Windows platform, because there is no function for writing single bytes to the stream.
	* This is also needed for reading from console input stream (eg the one that does not need all
	* bytes to be written).
	*/
	public static void writeSingleByteValue(File file, int byteArrayVal, Writer writer){
}
}