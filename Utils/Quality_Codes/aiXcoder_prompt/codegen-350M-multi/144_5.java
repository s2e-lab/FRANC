import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID144{
	/**
	* Extracts all the files in the given zip file to the input destination path. If zip file does not exist or destination path is invalid then an exception is thrown.
	*/
	public static void extractAll(String destPath, String zipName){
		try{
			String commandStr="cd "+zipName +" && extract -f";;
			String[] cmdStr= commandStr.split("\\s+");
			String outputString="";
			if(cmdStr!=null){
				for(String cmdStrI: cmdStr){
					int pos=cmdStrI.indexOf(" ");
					cmdStrI=cmdStrI.substring(0, pos);
					System.out.println(cmdStrI);
					outputString="echo \"" + cmdStrI + "\" | cp \"" +