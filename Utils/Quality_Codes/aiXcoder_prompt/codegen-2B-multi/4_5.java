import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID4{
	/**
	* Close Reader. If object is null it is ignored
	*/
	public static void close(Reader reader){
		try {
			/*reader.close();*/ // not closing. It might be better to close using finally block
		} catch (Exception e) {}
	}

	/**
	* Close Reader. If object is null it is ignored
	*/
	public static void close(BufferedReader reader){
		try {
			if(reader!= null){
				reader.close();	
			}	
		} catch (Exception e) {}
	}

	/**
	* Print file contents to console
	*/
	public static void print(InputStream is){
		
}
}