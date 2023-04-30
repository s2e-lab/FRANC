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
		 Class classObj =  ObjectUtils.getFirstClass(className);
		 if( classObj == null)
		 System.err.println("Could not locate class name '" + className + "'");
		 return classObj;
	 }

	/** 
	 * Display trace description.
	 * @param stTrace trace output format string object.
	 * @param stTraceClass trace output object class name.
	 */
	private void showTraceDescription(final PrintStream stTrace,String stTraceClass) {
		stTrace.println(stTraceClass);
		// stTrace.
}
}