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
			File file=new File(fileName);
			if(file.exists()){
				file.delete();
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	protected static void appendOutput(StringOutputStream sout, String value){
		sout.append(value);
		sout.flush();
	}

	
	private static void appendOutput(CompositeOutputStream cout,String value){
}
}