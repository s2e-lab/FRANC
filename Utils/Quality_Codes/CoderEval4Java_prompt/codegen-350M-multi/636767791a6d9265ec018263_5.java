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
		try {
			return Class.forName(className);
		} catch (ClassNotFoundException e) {
			System.err.println("No such class " + className);
			System.err.println(e);
			System.err.println("Can not find class " + className);
			return null;
		}
	}
	/** 
	 * Render trace.
	 * @param result return value, may not be null
	 * @param trace to render
	 * @return html rendered as String
	 */
}