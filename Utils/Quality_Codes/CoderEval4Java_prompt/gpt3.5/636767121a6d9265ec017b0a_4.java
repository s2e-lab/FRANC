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
		// iterate until the end of line is found
		while(i<headerPart.length()){
			// check if the current character is '\r'
			if(headerPart.charAt(i) == '\r'){
				// if yes, check if the next character is '\n'
				if(headerPart.charAt(i+1) == '\n'){
					// if yes, return the index of the '\r\n' sequence
					return i+1;
				}
			}
			i++;
		}
		// if end of line is not found return -1
		return -1;
	}
	
	/** 
	 * Extracts the file name from the Content-Disposition header.
	 * @param headerPart The headers, which are being parsed.
	 * @return The file name extracted from the header.
	 */
	
	public String extractFileName(String headerPart){
		String fileName = "";
		// check if the header contains the Content-Disposition field
		if(headerPart.indexOf("Content-Disposition") != -1){
			// if yes, extract the file name from the header
			String[] parts = headerPart.split("=");
			if(parts.length>1){
				fileName = parts[1].replace("\"", "");
			}
		}
		return fileName;
	}
	
	/** 
	 * Reads the uploaded file and saves it to the server disk.
	 * @param request The request object, which contains the input data stream.
	 * @param path The path where the file should be saved.
	 * @return The name of the saved file.
	 */
	
	public String saveFile(HttpServletRequest request,String path) throws Exception{
		String fileName = "";
		// get the input stream from the request object
		InputStream in = request.getInputStream();
		// create a byte array with a default size of 1KB
		byte[] buffer = new byte[1024];
		// create a file output stream with the given path
		FileOutputStream out = new FileOutputStream(path);
		int bytesRead = 0;
		// read the data from the input stream and write it to the output stream
		while((bytesRead = in.read(buffer)) != -1){
			out.write(buffer,0,bytesRead);
		}
		// close the input and output streams
		in.close();
		out.flush();
		out.close();
		// get the file name from the headers and rename the file if necessary
}
}