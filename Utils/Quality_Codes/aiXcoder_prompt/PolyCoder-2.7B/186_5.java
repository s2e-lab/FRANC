import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID186{
	/**
	* Returns whether or no the JDK version is 1.7u40 and above.
	*/
	public static boolean isJdk7u40Above(){
			String javaVersion = System.getProperty("java.version");
			
			// The 1.6-2.4.1 java version is a JDK version between 1.7u40
			// and the first release after 6.1 (JIRA 7.1.6).
			if(javaVersion.startsWith("1.6-2") || javaVersion.equals("1.7.u40")){ // TODO: fix - need to rethink this.
				return true;
			}
			
			// The 1.7.u40-2.0
}
}