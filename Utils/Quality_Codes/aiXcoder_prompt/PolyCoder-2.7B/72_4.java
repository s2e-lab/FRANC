import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID72{
	/**
	* Create an instance of a clazz using the current thread context ClassLoader.
	*/
	public static <T> T newInstance(Class<T> clazz){
			return AccessController.doPrivileged(new PrivilegedAction<T>() {
				public T run(){
					Class type = clazz;
					ClassLoader cl = Thread.currentThread().getContextClassLoader();
					if (cl!= null)
						type = Class.forName(clazz.getName(), true, cl); 
					Object o = ClassLoader.class.getConstructor().newInstance();
					try {
						o.getClass().getDeclaredMethod("newInstance").invoke(o);
						return (T) o;
					} catch (InvocationTargetException e) {
					