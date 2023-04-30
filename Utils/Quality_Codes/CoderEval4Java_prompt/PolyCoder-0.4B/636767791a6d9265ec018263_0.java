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
		 Class clazz = classLoader.loadClass( className );
		 while (clazz!= null) {
			 if (clazz.getName().equals( className )){
				 break;
			 }
			 clazz = classLoader.loadClass( className );
		 }
		 if (clazz == null) {
				 throw new ClassNotFoundException( className );
		 }
		 return clazz;
	 }
	
}