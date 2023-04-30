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
				Class result = null;

				Enumeration e = Class.forName(className);
//					System.err.println(">>>>> class name " + className + " is: " + e);

				while (e!= null) {
					if(e instanceof URLClassLoader) {
						Class clz = ((URLClassLoader) e).getClass();
						result = clz;
					}
					else if(e == Error.class)  ; // error exception
					else if(getClass().getName().equals(e