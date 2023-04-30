import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class FileUtils{
	/** 
	 * Schedules a file to be deleted when JVM exits. If file is directory delete it and all sub-directories.
	 * @param file  file or directory to delete, must not be {@code null}
	 * @throws NullPointerException if the file is {@code null}
	 * @throws IOException in case deletion is unsuccessful
	 */
	
	public static void forceDeleteOnExit(File file) throws IOException {
		final String method = "forceDeleteOnExit(File)";

		if(file == null){
			logException(method, new NullPointerException("File cannot be null"));
		}
		if(!file.exists()){
			logException(method, new IllegalArgumentException("File does not exist")); 
		}
		if(file.isDirectory()){
			deleteDir(file);

		}
		else {
			file.delete();
		}
	}

	private static void deleteDir(File file) {
}
}