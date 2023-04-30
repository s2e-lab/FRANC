import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class CompositeRollingAppender{
	/** 
	 * Delete's the specified file if it exists 
	 */
	
	protected static void deleteFile(String fileName){
		File file = new File(fileName);
		if(file.exists()){
			file.delete();
		}
	}
	
	public static void main(String[] args) throws IOException{
		StringBuilder output=new StringBuilder();
		String fileName=args[0];
		String message=args[1];
		String fileSeparator="/";
		if(args.length>2){
			fileSeparator=args[2];
		}
		
		String[] line="";
}
}