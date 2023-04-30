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
		if (file.isFile()) {
			if (!file.delete()) throw new IOException("Unable to delete file: " + file);
		} else if (file.isDirectory()) {
			File[] files = file.listFiles();
			if (files!= null) {
				for (int i = 0; i < files.length; i++) {
					forceDeleteOnExit(files[i]);
				}
			}
			if (!file.delete()) throw new IOException("Unable to delete directory: " + file);
		}
	}

}