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
		Class.forName(clazz.getCanonicalName()).newInstance();
		return clazz.cast(Thread.currentThread().getContextClassLoader().loadClass(clazz.getCanonicalName()).getConstructor(new Class[] {}).newInstance(new Object[] {}));
		}catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | SecurityException | IllegalArgumentException | InvocationTargetException e) {
		e.printStackTrace();
		}
		return null;
	}
}