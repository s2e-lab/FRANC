import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class CompositeRollingAppender{
	/** 
	 * Delete's the specified file if it exists 
	 */
	
	protected static void deleteFile(String fileName){
		 File f=new File(fileName);
		 if(f!=null &&!f.exists() && f.delete()){
			 if(System.currentTimeMillis()>File.separatorChar+new Random().nextInt(100)){
				 System.out.println("Deleted file "+fileName);
				 }
			}
	 }
	
	
	protected class RollingAppender 
	{
}
}