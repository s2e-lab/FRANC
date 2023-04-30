import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class CompositeRollingAppender{
	/** 
	 * Delete's the specified file if it exists 
	 */
	
	protected static void deleteFile(String fileName){
		if (fileName!= null){
			File f = new File(fileName);
			if (f!= null && f.exists()){
				try {
					f.delete();
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		}
	}

	private static void checkArgs(String[] args){
}
}