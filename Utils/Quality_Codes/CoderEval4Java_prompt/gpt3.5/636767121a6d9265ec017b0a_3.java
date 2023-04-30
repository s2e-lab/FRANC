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
			int pos = headerPart.indexOf("\r\n", end);
		if(pos==-1) {
			pos = headerPart.indexOf("\n", end);
			if(pos==-1)
				throw new RuntimeException("Could not find end of line.");
		}
		return pos + 2;
	}
	
	/**
	 * Parses the content disposition header.
	 * @param headerPart The headers, which are being parsed.
	 * @return The name of the uploaded file.
	 */
	
	private String parseContentDisposition(String headerPart) {
		int start = headerPart.indexOf("filename=\"");
		if(start==-1)
			throw new IllegalArgumentException("Missing filename in Content-Disposition: " + headerPart);
		start += 10; // "filename=\"" has 10 characters
		int end = headerPart.indexOf("\"", start);
		if(end==-1)
			throw new RuntimeException("Invalid filename in Content-Disposition: " + headerPart);
		return headerPart.substring(start, end);
	}
	
	/**
	 * Parses the content type header.
	 * @param headerPart The headers, which are being parsed.
	 * @return The content type of the uploaded file.
	 */
	
	private String parseContentType(String headerPart) {
		int start = headerPart.indexOf("Content-Type: ");
		if(start==-1)
			return null;
		start += 14; // "Content-Type: " has 14 characters
		int end = parseEndOfLine(headerPart, start);
		return headerPart.substring(start, end-2); // remove delimiter "\r\n"
	}
	
	/**
	 * Parses a part of a MIME message, which represents an uploaded file.
	 * @param input An InputStream, from which the MIME message is read.
	 * @return Representation of the uploaded file.
	 */
	
	public FormData parseFile(InputStream input) throws Exception {
		
		// Read the headers
		boolean inHeaders=true;
		String headers="";
		int lineStart=0;
}
}