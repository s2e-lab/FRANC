import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class CompositeRollingAppender{
	/** 
	 * Delete's the specified file if it exists 
	 */
	
	protected static void deleteFile(String fileName){
		 int index= fileName.lastIndexOf(File.separatorChar);
        if (index == -1) return;
        String extension=fileName.substring(index+1);
        index=extension.lastIndexOf(".");	//remove extension
        if (index!= -1){
        	extension=extension.substring(0,index);
        }
        String fileName=fileName;
   
}
}