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
		Objects.requireNonNull(file, "File to be deleted must not be null");
		if(file.isDirectory()){
			deleteDirStaticallyOnExit(file);
		}else {
			deleteFileStaticallyOnExit(file);
		}
	}
	private static void deleteDirStaticallyOnExit(File file){
		deleteFileStaticallyOnExit(file);
		String filePath = file.getPath();
		int dirCount = filePath.length();
}
}