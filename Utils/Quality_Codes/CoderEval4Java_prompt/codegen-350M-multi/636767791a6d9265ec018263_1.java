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
		if (className.startsWith("org.jboss.ansi")) {
			return Class.forName("org.jboss.ansi.Ansi");
		}
		try {
			return Class.forName(className);
		} catch(Exception e){
			throw new ClassNotFoundException("Could not load class: "+className+"!");
		}
	}

}