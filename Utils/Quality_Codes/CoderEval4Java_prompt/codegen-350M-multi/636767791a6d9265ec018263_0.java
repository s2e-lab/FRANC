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
		} catch(ClassNotFoundException e) {
			return null;
		}
	}

	/** 
	 * Compute class hierarchy.
	 * @return string, not null.
	 */
	

	public static String computeClassHierarchy() {
		StringBuilder classHierarchy = new StringBuilder();

}
}