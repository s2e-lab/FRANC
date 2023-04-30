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
			int index = headerPart.indexOf("\r\n", end);
		if(index == -1){
			throw new NoSuchElementException("End of line not found");
		}
		return index;
	}
	
	/**
	 * Parses the file name out of the headers.
	 * @param headers The headers, which are being parsed.
	 * @return The parsed out file name or null if not found.
	 */
	
	public String parseFileName(String headers){
		String fileName = null;
		int index = headers.indexOf("filename=");
		if(index != -1){
			fileName = headers.substring(index + 10, parseEndOfLine(headers,index+10));
			int lastIndex = fileName.lastIndexOf("\\");
			if(lastIndex != -1){
				fileName = fileName.substring(lastIndex+1);
			}
			if(fileName.equals("\"")){
				fileName = null;
			}
		}
		return fileName;
	}
	
	/**
	 * Parses the boundaries out of the headers.
	 * @param headers The headers, which contain the boundary information.
	 * @return The parsed out boundary or null if not found.
	 */
	
	public String parseBoundary(String headers){
		String boundary = null;
		int index = headers.indexOf("boundary=");
		if(index != -1){
			boundary = headers.substring(index + 9, parseEndOfLine(headers,index+9));
			if(boundary.charAt(0) == '\"'){
				boundary = boundary.substring(1,boundary.length()-1);
			}
		}
		return boundary;
	}
	
	/**
	 * Parses the content type out of the headers.
	 * @param headers The headers, which contain the content type.
	 * @return The parsed out content type or null if not found.
	 */
	
	public String parseContentType(String headers){
		String contentType = null;
		int index = headers.indexOf("Content-Type: ");
		if(index != -1){
			contentType = headers.substring(index + 14, parseEndOfLine(headers,index+14));
		}
		return contentType;
	}
	
	/**
	 * Parses the content disposition out of the headers.
	 * @param headers The headers, which contain the content disposition.
	 * @return The parsed out content disposition or null if not found.
	 */
	
	public String parseContentDisposition(String headers){
		String contentDisposition = null;
		int index = headers.indexOf("Content-Disposition");
}
}