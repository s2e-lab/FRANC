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
		Class found = Class.forName(className);
		if (found == null) 
			throw new ClassNotFoundException("Expected class " + className + " not found"); 
		return found;
	} 
	

}
