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
		 
		final String fullClassName = className;
		final int lastChar = fullClassName.lastIndexOf("."); //NOI18N
		if (lastChar == -1) {
			throw new ClassNotFoundException(".class" + className); // NOI18N
		}
}
}