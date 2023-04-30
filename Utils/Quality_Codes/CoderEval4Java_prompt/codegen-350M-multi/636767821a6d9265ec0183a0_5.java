import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class CompositeRollingAppender{
	/** 
	 * Delete's the specified file if it exists 
	 */
	
	protected static void deleteFile(String fileName){
		String fNames[]={"rolls.dat","logs.dat"};
		String deleteFlag=fileName;
		for (String fv:fNames){
			File f=new File(fileName+fv);
			if (f.exists()){
				deleteFile(f.getName());
			} 
		}
		deleteFlag+=".tmp";
}
}