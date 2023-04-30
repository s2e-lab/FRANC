import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID72{
	/**
	* Create an instance of a clazz using the current thread context ClassLoader.
	*/
	public static <T> T newInstance(Class<T> clazz){
		return newInstance(clazz, Thread.currentThread().getContextClassLoader());
	}

	/**
	* Create an instance of a clazz
	*/
	public static <T> T newInstance(Class<T> clazz, ClassLoader classLoader){
}
}