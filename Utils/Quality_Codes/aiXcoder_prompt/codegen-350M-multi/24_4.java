import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID24{
	/**
	* Writes a collection of Strings to a File, overwriting any previous file contents. Each String is converted into a line in the File.
	*/
	public static void writeFile(Collection<String> lines, File file){
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			for (String line : lines)
				writer.write(line + "\n");
			writer.close();
		}
		catch (IOException e) {
			System.out.println("IO Exception: " + e);
			System.exit(1);
		}
	}
}

/**
*  Description of Class ObjectID24
* @author S. J. 
*
*/

public class ObjectID24 {
}