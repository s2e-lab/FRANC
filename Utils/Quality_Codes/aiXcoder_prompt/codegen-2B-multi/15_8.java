import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID15{
	/**
	* Copy a file from source path to destination path
	*/
	public static void copyFile(String sourcePath, String destPath){
		try{
			BufferedReader in = new BufferedReader(new FileReader(sourcePath));
			FileOutputStream out = new FileOutputStream(destPath);

			int c;
			while((c = in.read())!= -1){
				out.write(c);
			}

			in.close();
			out.close();
		}catch(IOException e){}
	}

}