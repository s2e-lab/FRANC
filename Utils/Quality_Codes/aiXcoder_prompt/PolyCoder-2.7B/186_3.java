import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID186{
	/**
	* Returns whether or no the JDK version is 1.7u40 and above.
	*/
	public static boolean isJdk7u40Above(){
			if (System.getProperty("os.name").equals("Mac OS X")){
			
				String OSVersion = System.getProperty("os.version", "").toLowerCase();
				double OSVersionNumber = new Double(OSVersion).doubleValue();
				if (OSVersionNumber >= 1.7) return true;
		
			}
			return false;
	}
	
	
	public static void main(String[] args)
	{
		double max=0;
		
}
}