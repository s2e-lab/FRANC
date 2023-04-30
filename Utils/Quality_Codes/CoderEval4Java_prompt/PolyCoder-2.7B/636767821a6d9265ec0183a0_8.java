import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class CompositeRollingAppender{
	/** 
	 * Delete's the specified file if it exists 
	 */
	
	protected static void deleteFile(String fileName){
		 if(fileName==null)
			 return;
		File file = new File(fileName);
		if(file.exists()){
			System.out.println("Deleted: "+file.getAbsolutePath());
		}
		if(file.exists()){
			try{
				file.delete();
				file.deleteOnExit();
			}catch(Exception e){
				e.printStackTrace();
				System.out.println("Error trying to delete "+fileName);
			}
		}
	}
	
}