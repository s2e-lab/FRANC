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
			String classNameLower = className.toLowerCase();
			Class<?> clazz = null;
			for(int i = 0 ; classNameLower.length() ; i++) {
				className = classNameLower.substring(0, i).toLowerCase() + classNameLower.substring(i);
				clazz = Class.forName(className);
				if(clazz!= null) {
					if (ThrowableRecycling.getInstance().shouldRecurse(clazz)) {
						return clazz;
					}
				}

			} 
			return null;
	
}
}