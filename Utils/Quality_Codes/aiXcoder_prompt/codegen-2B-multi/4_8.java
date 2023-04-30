import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID4{
	/**
	* Close Reader. If object is null it is ignored
	*/
	public static void close(Reader reader){
		try{
			if(reader!= null)
				reader.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	/**
	* Close OutputStream
	*/
	public static void close(OutputStream stream){
		try{
			if(stream!= null)
				stream.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	// String, int and float
}