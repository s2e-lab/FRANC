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
		 
	  if (Log.isEnabled())
	    Log.log(LoggerType.ERROR,"EnhancedThrowableRenderer found " +className);     
       
	  if(className==null){
	    throw new ClassNotFoundException("No class found, please provide class.");     
	  }

	  Class clazz = null;
}
}