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
		if(index == -1) {
			throw new IllegalArgumentException("Unable to parse end of line for header: " + headerPart.substring(end));
		}
		return index;
	}
	
	/**
	 * Parses the Content-Disposition header and returns the filename.
	 * @param header The Content-Disposition header.
	 * @return Filename if found, otherwise null.
	 */
	
	private String parseFilename(String header) {
		int startIndex = header.indexOf("filename=");
		if (startIndex == -1) {
			return null;
		}
		startIndex += "filename=".length();
		startIndex = header.indexOf("\"", startIndex);
		int endIndex = header.indexOf("\"", startIndex + 1);
		if (endIndex == -1) {
			return null;
		}
		return header.substring(startIndex + 1, endIndex);
	}
	
	/**
	 * Saves file data to the specified file.
	 * @param fileData The file content.
	 * @param fileName The file name.
	 * @param filePath The directory path to save the file.
	 * @throws IOException If the file could not be saved.
	 */
	
	private void saveFile(byte[] fileData, String fileName, String filePath) throws IOException {
		File file = new File(filePath, fileName);
		try (FileOutputStream fos = new FileOutputStream(file)) {
			fos.write(fileData);
			fos.flush();
		}
	}
	
	/**
	 * Handles file upload requests.
	 * @param inputStream The input stream containing the file data.
	 * @param headers The headers of the upload request.
	 * @param filePath The directory path to save the uploaded file.
	 * @throws IOException If an error occurred during file upload.
	 */
	
	public void handleFileUpload(InputStream inputStream, String headers, String filePath) throws IOException{
		String boundary = "--" + headers.substring(headers.indexOf("boundary=") + "boundary=".length());
		byte[] boundaryBytes = boundary.getBytes();
		int endOfHeader = parseEndOfLine(headers, 0);
}
}