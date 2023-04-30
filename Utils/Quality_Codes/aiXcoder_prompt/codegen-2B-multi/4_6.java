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
			}catch(IOException e){
			}
		}
	}
	/**
	* Close Print Writer. If object is null it is ignored
	*/
	public static void close(Writer writer){
		if(writer!= null){
			try{
				writer.close();
			}catch(IOException e){
			}
		}
	}
	/**
	* Close Buffered Reader. If object is null it is ignored
	*/
}