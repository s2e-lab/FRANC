import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class WriteSession{
	/** 
	 * Returns a single byte array containg all the contents written to the buffer(s).
	 */
	
	public final byte[] toByteArray(){
			//code to create a ByteArrayOutputStream and write the contents of the buffer(s) to it
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		try{
			writeContents(outputStream);
			outputStream.close();
		}catch(IOException e){
			//handle the exception
		}
		return outputStream.toByteArray();
	}
	
	/**
	 * Writes the contents of the buffer(s) to the specified output stream.
	 */
	private final void writeContents(OutputStream out) throws IOException{
		//code to iterate through each buffer and write its contents to the output stream
		for(Buffer buffer: buffers){
			out.write(buffer.getContents(), 0, buffer.size());
		}
	}

	//other methods and fields of the class
}
