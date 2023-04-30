import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID186{
	/**
	* Returns whether or no the JDK version is 1.7u40 and above.
	*/
	public static boolean isJdk7u40Above(){
			String version = System.getProperty("java.specification.version"); //$NON-NLS-1$
		  int dots = version.indexOf('.');
		  if( dots == -1 ){
			  version = version.concat("99"); //$NON-NLS-1$
		  }else{
			  version = version.substring(0, dots);
		  }
		  int major = Integer.parseInt(version.substring(0, 2));
		  int minor = Integer.parseInt(version.substring(2));
		  // JAVA 15.21.x requires minor version 10
}
}