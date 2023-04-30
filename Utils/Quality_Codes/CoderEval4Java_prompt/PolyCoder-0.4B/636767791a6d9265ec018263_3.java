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
			// TODO: replace with real-time class loader

			ClassLoader loader = Thread.currentThread().getContextClassLoader();

			try {
				Class cl = Class.forName(className, true, loader);

				// System.err.println("Got class : " + className);

				if (cl!= clazz) {
					clazz = cl;
					return cl.newInstance();
				}

				return clazz;
			} catch (Exception e) {
				throw new ClassNotFoundException("Error creating class");
			}

}
}