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
			Class foundClass = Thread.currentThread().getContextClassLoader().loadClass(className);
        if(!foundClass.getName().equals("org.apache.log4j.Logger")) {
	        log.error("Found class " + foundClass.getName() + " but is not Log4jLogger");
            throw new ClassNotFoundException(className);
        }

        return foundClass;

	} 
}