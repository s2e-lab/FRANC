import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID15{
	/**
	* Copy a file from source path to destination path
	*/
	public static void copyFile(String sourcePath, String destPath){
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(destPath);
			bw = new BufferedWriter(fw);

			String line = null;
			InputStreamReader ir = new InputStreamReader(new FileInputStream(sourcePath));
			while ((line = ir.readLine())!= null) //read file line by line
				bw.write(line + '\n');

		} catch (IOException io) {
			System.out.println(io);
		}

}
}