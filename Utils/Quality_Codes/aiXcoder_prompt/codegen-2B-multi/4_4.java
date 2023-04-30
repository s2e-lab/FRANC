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
		if(reader!=null)
			reader.close();
		}
		catch(Exception ex)
		{
			System.out.println("ex ex: "+ex.getMessage());
		}
	}
	/**
	* Close Writer. If object is null it is ignored
	*/
	public static void close(Writer writer){
}
}