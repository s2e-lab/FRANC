import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID4{
	/**
	* Close Reader. If object is null it is ignored
	*/
	public static void close(Reader reader){
		if(reader!=null)
			try {
				reader.close();
			} catch(IOException ex) {
				ex.printStackTrace();
			}
	}

	public static void main(String[] args){
		//System.out.println();

}
}