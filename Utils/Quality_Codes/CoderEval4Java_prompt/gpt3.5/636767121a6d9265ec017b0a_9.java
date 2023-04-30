import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class FileUpload{
	/** 
	 * Skips bytes until the end of the current line.
	 * @param headerPart The headers, which are being parsed.
	 * @param end Index of the last byte, which has yet been processed.
	 * @return Index of the \r\n sequence, which indicates end of line.
	 */
	
	private int parseEndOfLine(String headerPart,int end){
			int i = end;
		while(i < headerPart.length()){
			if(headerPart.charAt(i) == '\r' && (i+1) < headerPart.length() && headerPart.charAt(i+1) == '\n'){
				return i+2;
			}
			i++;
		}
		return -1;
	}

	/**
	 * Parses a Content-Disposition header and extracts the filename.
	 * @param headerValue Value of the Content-Disposition header.
	 * @return Filename, which is given in the header, or null, if no filename is given.
	 */
	
	private String parseFilename(String headerValue){
		String[] parts = headerValue.split(";");
		for(int i=1;i<parts.length;i++){
			String part = parts[i].trim();
			if(part.toLowerCase().startsWith("filename=")){
				int index = part.indexOf('=');
				return part.substring(index+1);
			}
		}
		return null;
	}

	/**
	 * Reads a line from the input stream.
	 * @param in Stream to read from.
	 * @return The read line or null, if no more data is available.
	 */
	
	private String readLine(InputStream in){
		StringBuilder sb = new StringBuilder();
		try{
			int readChar = in.read();
			while(readChar != -1 && readChar != '\n'){
				if(readChar != '\r'){
					sb.append((char)readChar);
				}
				readChar = in.read();
			}
			if(readChar == -1 && sb.length() == 0){
				return null;
			}
			return sb.toString();
		}catch(IOException ex){
			throw new IllegalArgumentException(ex);
		}
	}

	/**
	 * Reads the headers of the HTTP request and returns the value of the
	 * Content-Disposition header.
	 * @param in Stream to read from.
	 * @return Value of the Content-Disposition header or null if no such header is present.
	 */
	
	public String parseHeaders(InputStream in){
		String line = readLine(in);
		String contentDisposition = null;
		while(line != null && line.length() > 0){
			if(line.startsWith("Content-Disposition:")){
				contentDisposition = line.substring(line.indexOf(':') + 1).trim();
			}
			line = readLine(in);
		}
		return contentDisposition;
	}
}