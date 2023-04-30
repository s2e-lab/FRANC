import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID72{
	/**
	* Create an instance of a clazz using the current thread context ClassLoader.
	*/
	public static <T> T newInstance(Class<T> clazz){
		 if(clazz == null){
			 throw new NullPointerException("class");
		 }
		
		T instance = null;
		
		if(!Thread.currentThread().getContextClassLoader().equals(clazz.getClassLoader())){
			instance = (T) new ObjectFactory(clazz).newInstance();
		}
		else{
			instance = (T)clazz.newInstance();
		}
		return instance;
	}
	
	/**
     * Create an instance of a type using the current thread context ClassLoader.
     */
  
}