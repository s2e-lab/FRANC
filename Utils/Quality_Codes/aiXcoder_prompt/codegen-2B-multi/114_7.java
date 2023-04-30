import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID114{
	/**
	* Check whether a file is actually a valid zip
	*/
	public static boolean isValidZip(File zip){
		try{
			BufferedReader in = new BufferedReader(new FileReader(zip));
			String str = in.readLine();
			String[] first = str.split(" ");
			if(str.indexOf("PK") > -1)
			{
				String[] second = first[10].split(" ");
				if(second.length == 3){
					long file_size = Long.parseLong(second[0]);
					long file_magic = Long.parseLong(second[2]);
					if(file_size > 0 && file_