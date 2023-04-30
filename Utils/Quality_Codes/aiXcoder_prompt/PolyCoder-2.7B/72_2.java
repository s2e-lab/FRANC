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
			if (System.getClass().getClassLoader() == null) {
				throw new ClassLoaderException(clazz.getName() + " not class-loader accessible.");
			}

			return (T) clazz.newInstance();
		} catch (IllegalAccessException e) {
			throw new Error(e);
		} catch (InstantiationException e) {
			throw new Error(e);
		} catch (InvocationTargetException e) {
			throw new Error(e);
		}
	}
}