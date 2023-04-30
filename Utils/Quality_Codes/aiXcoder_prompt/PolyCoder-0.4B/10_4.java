import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID10{
	/**
	* Looks through the backups directory and assembles a list of all json backup files found. 
	*/
	public static List<String> getBackupFiles(String dir){
			List<String> returnList = new ArrayList<String>();
			BufferedReader infile = null;
			try {
				infile = new BufferedReader(new FileReader(new File(dir)));
				String line; 
				while ((line = infile.readLine())!= null)
					if (!line.startsWith("[ "))
						returnList.add(line);
				return returnList;
			}
			catch (IOException ioe) { throw new RuntimeException(ioe); }
}
}