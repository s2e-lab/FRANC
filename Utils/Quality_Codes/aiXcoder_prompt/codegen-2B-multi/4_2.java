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
			if(reader!= null) reader.close();
		}catch(Exception e){
		}
	}

	/**
	* close Reader. If object is null it is ignored
	*/
	public static void close(InputStream reader){
		try{
			if(reader!= null) reader.close();
		}catch(Exception e){
		}
	}

	/**
	* Close BufferedReader. If object is null it is ignored
	*/
	public static void close(BufferedReader reader){
}
}