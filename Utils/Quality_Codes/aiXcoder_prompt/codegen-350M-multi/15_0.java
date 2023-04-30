import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID15{
	/**
	* Copy a file from source path to destination path
	*/
	public static void copyFile(String sourcePath, String destPath){
		try {
			String line = null;
			Scanner scanner = new Scanner(new File(sourcePath));
			BufferedReader input = new BufferedReader(scanner);
			while((line = input.readLine())!= null) {
				int n1 = StringUtil.find(line.toLowerCase().substring(0,1), "#") == -1? line.length() : StringUtil.indexOf(line.toLowerCase().substring(0,1), "#");
				int n2 = StringUtil.find(line.to