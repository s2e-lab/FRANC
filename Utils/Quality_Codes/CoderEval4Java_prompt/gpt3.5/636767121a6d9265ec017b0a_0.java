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
		while(i < headerPart.length()-1){
			if(headerPart.charAt(i) == '\r' && headerPart.charAt(i+1) == '\n'){
				return i+2;	//returning index of the next byte after \r\n
			}
			i++;
		}
		return -1;	//If \r\n is not found until the end of header part, return -1 as error.
	}

	/**
	 * Extracts the boundary string from a part of header that
	 * contains Content-Type header.
	 * @param headerPart The headers, which are being parsed.
	 * @return The boundary string.
	 */
	
	private String parseBoundary(String headerPart){
		int index = headerPart.indexOf("boundary=") + 9;//Index of the first byte after "boundary="
		if(index == -1){	//If no "boundary=" is found, return null as error.
			return null;
		}		
		char delimiter = headerPart.charAt(headerPart.indexOf("boundary=")+9); //Delimiter might be ' or "
		int end = headerPart.indexOf(delimiter,index+1); //End index of boundary string
		if(end == -1){ //If delimiter not found, return null as error.
			return null;
		}
		String boundary = headerPart.substring(index+1,end);
		return boundary;
	}

	/** 
	 * Reads the uploaded file data from the input stream and saves it to disk.
	 * @param input HTTP input stream.
	 * @param contentLength Length of uploaded file.
	 * @param boundary Boundary string that separates multiple parts of the request.
	 * @param filename Name of the file to be saved.
	 * @param saveDirectory Directory where the file is to be saved.
	 * @return True, if file is successfully uploaded and saved. False, otherwise.
	 */
	
	public boolean uploadFile(InputStream input,long contentLength,String boundary,String filename,String saveDirectory){
		boolean success = false;
		int bufferSize = 4096; //Size of buffer to read file data
		byte[] buffer = new byte[bufferSize];
		int bytesRead = 0;
		int totalBytesRead = 0;
		String line = null;
		FileOutputStream output = null;
		
}
}