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
		
		System.out.println("Using EnhancedThrowableToStringRenderer ClassName. Should be an enhanced class of this form(name, version) : className="+className);
		Class claz = Class.forName(className);
		System.out.println("Class.forName(className) == "+claz);
		Class[] clazs = new Class[]{};
		return Class.forName(clazs, true, enhancedClassLoader);
	}
	
	
}