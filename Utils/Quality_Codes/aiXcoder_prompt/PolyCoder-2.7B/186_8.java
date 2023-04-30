import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID186{
	/**
	* Returns whether or no the JDK version is 1.7u40 and above.
	*/
	public static boolean isJdk7u40Above(){
			String version = getAppVersion();
			String osName = System.getProperty("os.name");

		    if(!OS_NAME.contains(osName))
		    return false;

		    if((version.startsWith("1.7") || version.startsWith("1.6")) &&!isJavaVersionBelow1_7u40(version))
		    return false;

		    return true;
	}

	public static boolean isJavaVersionBelow1_7u40(String version){

}
}