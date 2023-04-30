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
			if (isLoadedUsingNative(clazz)){
				return nativeInst.newInstance(clazz);
			}else{
				return createUsingReflection(clazz);
			}
		}catch(InstantiationException e){
			return null;
		}catch(IllegalAccessException e){
			return null;
		}
	}

	/**
	* Create an instance of a clazz and allow it to use the JVM's default classloader
	*/
}