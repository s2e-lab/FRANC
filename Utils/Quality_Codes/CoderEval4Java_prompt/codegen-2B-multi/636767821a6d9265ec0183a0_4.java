import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class CompositeRollingAppender{
	/** 
	 * Delete's the specified file if it exists 
	 */
	
	protected static void deleteFile(String fileName){
		/** 
		 * Assuming that file name format is "test_output.log" and we are given "/home/user/test_output.log"
		 */
		File f=new File(fileName);
		System.out.println(f.getAbsolutePath()+"\n");
		if(f.exists()){
			f.delete();
		}
	}
	
	public static void main(String[] args) {
		
		BufferedWriter writer1=null;
		BufferedWriter writer2=null;
		

}
}