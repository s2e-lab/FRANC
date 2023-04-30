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
			// Check if the header part is empty or null
		if(headerPart == null || headerPart.isEmpty()){
			return -1;
		}
		// Iterate through the header part starting from the given index until the end of the header
		for(int i=end; i<headerPart.length()-1; i++){
			// Check if the current character is a carriage return '\r' and the next character is a line feed '\n'
			if(headerPart.charAt(i) == '\r' && headerPart.charAt(i+1) == '\n'){
				// Return the index of the end of line sequence
				return i+2;
			}
		}
		// If end of line sequence was not found, return -1
		return -1;
	}

	/**
	 * Parses the Content-Disposition header and returns the filename of the uploaded file.
	 *
	 * @param headers The headers of the HTTP request.
	 * @return The filename of the uploaded file.
	 */
	private String parseFileName(String headers){
		String fileName = null;
		// Split the headers using new line character as the delimiter
		String[] headerArray = headers.split("\n");
		// Iterate through the headers to find the Content-Disposition header
		for(String header : headerArray){
			// Check if the header starts with Content-Disposition
			if(header.startsWith("Content-Disposition")){
				// Split the header using semicolon as the delimiter
				String[] parts = header.split(";");
				// Iterate through the parts to find the filename parameter
				for(String part : parts){
					// Check if the part starts with filename
					if(part.trim().startsWith("filename")){
						// Get the filename by removing the double quotes and trimming the whitespace
						fileName = part.substring(part.indexOf("=") + 1).trim().replace("\"", "");
						break;
					}
				}
				break;
			}
		}
		return fileName;
	}

	/**
	 * Saves the uploaded file to the specified directory.
	 *
	 * @param inputStream The input stream containing the content of the uploaded file.
	 * @param fileName The name of the uploaded file.
	 * @param uploadDir The directory to which the file should be saved.
	 * @throws IOException If an I/O error occurs while reading or writing the file.
	 */
	public void saveFile(InputStream inputStream, String fileName, String uploadDir) throws IOException{
		// Create the output directory
}
}