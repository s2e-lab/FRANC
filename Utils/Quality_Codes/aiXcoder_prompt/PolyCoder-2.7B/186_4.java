import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID186{
	/**
	* Returns whether or no the JDK version is 1.7u40 and above.
	*/
	public static boolean isJdk7u40Above(){
		 boolean jdk7u40Above=false;		//Set a flag in case when the JDK version is lower than 1.7
		 String version = Utils.version();

		 try{
			 if((!version.startsWith("1.7"))&&(version.startsWith("1.8u"))&&(version.endsWith(Utils.VERSION_STRING_JRE_1_7))){
				 jdk7u40Above=true;
			 }
		 } catch(Throwable e){
		 }

		 return jdk7u40Above;
	 }


}