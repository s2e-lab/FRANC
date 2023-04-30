import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID72{
	/**
	* Create an instance of a clazz using the current thread context ClassLoader.
	*/
	public static <T> T newInstance(Class<T> clazz){
		T obj = null;
		try {
			ClassLoader classLoader= Thread.currentThread().getContextClassLoader();
			if (classLoader!=null)
				obj= clazz.cast(classLoader.loadClass(clazz.getName()).newInstance());
		} catch (ClassNotFoundException e) {
        } catch (IllegalAccessException e) {
        } catch (InstantiationException e) { }
		return obj;
	}
	
}