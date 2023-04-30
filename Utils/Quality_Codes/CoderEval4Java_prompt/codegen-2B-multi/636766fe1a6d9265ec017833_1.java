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
		if (file.isDirectory()) {
			File[] files = file.listFiles();
			for (File f : files) {
				forceDeleteOnExit(f);
			}
			file.delete();
		} else {
			// If it's just a file in that case, we're done.
			file.deleteOnExit();
		}
	}
}
