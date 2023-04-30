import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class FileIterator{
	/** 
	 * Add the specified files in reverse order.
	 */
	
	private void addReverse(final File[] files){
		for (File f:files){
			File f2 = f.length() > 0? new File(f.getParent(),f.getName()):"";
			String name = f2.getName();
			fileNames.add(name);

			if(!name.startsWith("."))
				name = "."+name;

			String pckPath = "";
			if(name.charAt(0)!='.' && name.charAt(1)!='.'){
				pckPath = "/"+name;
			}else