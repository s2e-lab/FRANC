import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class CompositeRollingAppender{
	/** 
	 * Delete's the specified file if it exists 
	 */
	
	protected static void deleteFile(String fileName){
		 new File(fileName).delete();
	}



	public static void main(String[] args) throws IOException {
		List < String > list = Arrays.asList("a", "b", "c", "d");

		
		
		RollingFileAppender sfwa = new RollingFileAppender();
		sfwa.setMaxFiles(3);
		
		sfwa.setFile(new File("c:/temp/dailyRoller/roller-20161215.log"));
			
		sfwa.activateOptions();
	
}
}