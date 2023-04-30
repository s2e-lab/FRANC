import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID83{
	/**
	* Returns a new, immutable collection containing the names of all entities within the directory denoted by the current path
	*/
	public static List<String> getFiles(String dir){
		List<String> files = new ArrayList<String>();
		String tmp;
		BufferedReader in;
		try{
			tmp = new File(dir).getCanonicalPath();
			in = new BufferedReader(new FileReader(tmp));
			while((tmp=in.readLine())!= null){
				files.add(tmp);
			}
			in.close();
		}
		catch(IOException e){
			System.err.println("Unable to read " + dir);
		}
		return files;
	}
}