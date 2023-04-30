import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID4{
	/**
	* Close Reader. If object is null it is ignored
	*/
	public static void close(Reader reader){
		if(reader!= null){
			try{
				reader.close();
			}catch(Exception exception){
				exception.printStackTrace(System.err);
			}
		}
	}
	
	/**
	* Close Writer. If object is null it is ignored
	*/
	public static void close(Writer writer){
		if(writer!= null){
			try{
				writer.close();
			}catch(Exception exception){
				exception.printStackTrace(System.err);
			}
		}
	}

}