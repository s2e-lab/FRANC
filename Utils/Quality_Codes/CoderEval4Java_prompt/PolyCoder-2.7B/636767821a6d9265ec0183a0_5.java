import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class CompositeRollingAppender{
	/** 
	 * Delete's the specified file if it exists 
	 */
	
	protected static void deleteFile(String fileName){
		 try{
			 if(new File(fileName).exists()){
				 new File(fileName).delete();
			 }
		 }catch(Exception e){
			 logger.info("[deleteFile] Failed to delete file ["+fileName+"]",e);
		 }
	}
	
	protected static boolean isDeleteFileSuccess(String fileName) {
		File file=new File(fileName);
		return(file.exists()&&file.delete());
	}	
	
}