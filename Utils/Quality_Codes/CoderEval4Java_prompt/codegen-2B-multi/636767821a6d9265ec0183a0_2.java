import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class CompositeRollingAppender{
	/** 
	 * Delete's the specified file if it exists 
	 */
	
	protected static void deleteFile(String fileName){
		File f = new File(fileName);
		if( f.exists() )
			if(!f.delete() ) 
				System.out.println( "CompositeRollingAppender: Failed to delete file " + fileName ); 
	}
	
	protected static void doRollover(){
		deleteFile( "log_test_1.log" );
		deleteFile( "log_test_2.log" );
		deleteFile( "log_test_3.log" );
}
}