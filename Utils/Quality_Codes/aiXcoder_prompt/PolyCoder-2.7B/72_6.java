import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID72{
	/**
	* Create an instance of a clazz using the current thread context ClassLoader.
	*/
	public static <T> T newInstance(Class<T> clazz){
			try {
				return clazz.getConstructor().newInstance();
			} catch (Throwable err){
				Throwable t;
				t = err;
    				if(t instanceof Error){
    					throw (Error)t;
    				}
				throw new Error(t.getMessage());
			}
	}
}

