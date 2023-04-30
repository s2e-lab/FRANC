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
		 
		 Class cls;
			
		 try {
			 cls = Class.forName(className);
		 } 
		 catch(RuntimeException e){
			 Throwable t = e.getCause();
			 if(t instanceof ClassNotFoundException || t instanceof NoSuchMethodException){}
			 throw new ClassNotFoundException(className);
		 }

	   return cls;
	}
	
	/**
	 * For each method we are going to call in order to call its main.
	 * @param clazz class.
	 */
	private void getMainClass(final Class clazz) {
}
}