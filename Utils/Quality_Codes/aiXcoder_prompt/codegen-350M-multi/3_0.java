import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID3{
	/**
	* Write content to the file. If file does not exist, it will create one.
	*/
	public static void writeToFile(String content, String fileName){
		//System.out.println("Writing file "+fileName);
		FileOutputStream output = null;
		try{
			output = new FileOutputStream(fileName);
			output.write(content.getBytes());
		}catch(java.io.IOException ioe){
			System.err.println(ioe);
		}finally{
			//close output stream
			if (output!= null){
				try{output.flush();}catch(java.io.IOException ioe){}
				output.close();
			}
		}

}
}