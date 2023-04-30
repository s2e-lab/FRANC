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
		if(className == null){
			throw new IllegalArgumentException("className == null");
		}
		try{
			return Class.forName(className);
		} catch(ClassNotFoundException e){
			if(e.getCause() instanceof ClassNotFoundException){
				ClassNotFoundException e1 = (ClassNotFoundException)e.getCause();
				throw e1;
			}else{
				throw e;
			}

		}
	}
	
	private static void printStackTrace(){
		//find last
}
}