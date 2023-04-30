import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID3{
	/**
	* Write content to the file. If file does not exist, it will create one.
	*/
	public static void writeToFile(String content, String fileName){
		try{
			FileWriter fWriter = new FileWriter(fileName);
			BufferedWriter bWriter = new BufferedWriter(fWriter);
			PrintWriter out = new PrintWriter(bWriter);
			out.println(content);
			out.flush();

			fWriter.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public static void main(String args[]){

}
}