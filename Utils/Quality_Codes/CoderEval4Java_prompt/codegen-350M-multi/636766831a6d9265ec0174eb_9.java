import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class FileIterator{
	/** 
	 * Add the specified files in reverse order.
	 */
	
	private void addReverse(final File[] files){
		for(int i=0; i<files.length; i++){
			File file = files[i];
			
            try{
            InputStream in = new FileInputStream(file);
            DataOutputStream out = new  DataOutputStream(new FileOutputStream(file));
           String name;
            if(name.contains(".")){
                String extension = name.replace(".", "").toLowerCase();
                name = name.substring(0, name.lastIndexOf("."))+"."+extension;
            }
            