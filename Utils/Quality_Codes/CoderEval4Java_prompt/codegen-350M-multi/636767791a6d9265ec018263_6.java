import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class EnhancedThrowableRenderer{
	/** 
	 * Find class given class name.
	 * @param className class name, may not be null.
	 * @return class, will not be null.
	 * @throws ClassNotFoundException thrown if class can not be found.
	 */
	
	private Class findClass(final String className) throws ClassNotFoundException {
		ClassLoader cl = Thread.currentThread().getContextClassLoader();
		if (cl == null) {
			return Class.forName(className);
		}
		return cl.loadClass(className);
	}
	
	/** 
	 * Convert EnhancedException to throwable, throw any exception whose type is not subclass of Exception itself, return a new Exception.
	 * @param t Throwable to convert.
	 * @return new throwable.
	 */
	private Throwable toThrowable(Throwable t){
}
}