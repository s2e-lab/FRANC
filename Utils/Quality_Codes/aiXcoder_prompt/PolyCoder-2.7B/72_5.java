import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID72{
	/**
	* Create an instance of a clazz using the current thread context ClassLoader.
	*/
	public static <T> T newInstance(Class<T> clazz){
		 return clazz.newInstance();
	}
	
	/**
	* Create an instance of a clazz using the current thread context ClassLoader.
	* Does not try any security checks
	*/
	public static <T> T newInstanceNoSecurityManager(Class<T> clazz){
}
}