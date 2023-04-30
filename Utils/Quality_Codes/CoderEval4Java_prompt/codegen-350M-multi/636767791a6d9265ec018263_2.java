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
		Class c= null;
		try {
			//c = ClassLoader.getSystemClassLoader().loadClass(className);
			c = Class.forName(className);
		} catch(ClassNotFoundException e) {
			throw new ClassNotFoundException(className+ " not found");
		} catch(NullPointerException e) {
			throw new ClassNotFoundException(className + " null");
		}
		return c;
	}

}