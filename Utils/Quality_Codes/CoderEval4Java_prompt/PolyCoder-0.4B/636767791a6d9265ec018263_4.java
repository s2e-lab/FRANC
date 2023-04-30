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
			if(className==null){   // use a default factory
				return  getClassLoader().loadClass(className);
			} else {
				// attempt to find class (in specified order)
				for(Class c : Reflection.getLoadedClasses()) {
					return c.getClassLoader().loadClass(className);
				}
			}
	}
	
}