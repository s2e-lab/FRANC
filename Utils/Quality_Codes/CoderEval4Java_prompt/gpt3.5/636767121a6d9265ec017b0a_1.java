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
			int i = headerPart.indexOf('\n', end); //Find the first occurrence of '\n' character starting from index 'end'
		if(i < 0){ //End of line not found
			return i;
		}
		if(i > 0 && headerPart.charAt(i-1) == '\r'){ //Found '\r\n' sequence, which indicates end of line
			return i-1;
		}
		return i; // '\n' character found but not immediately preceded by '\r'
	}

	/** 
	 * Parses the value of the "Content-Disposition" header to obtain the file name.
	 * @param contentDisposition The "Content-Disposition" header string.
	 * @return The file name value.
	 */
	
	private String extractFileName(String contentDisposition){
		String fileName = "";
	    int index = contentDisposition.indexOf("filename=");
	    if (index > 0) {
	        fileName = contentDisposition.substring(index + 10,contentDisposition.length() - 1);
	    }
	    return fileName;
	}
	
	/**
	 * Processes the uploaded file and saves it to the specified directory.
	 * @param fileData The byte array containing the file data.
	 * @param fileName The name of the uploaded file.
	 * @param uploadDir The directory to which the file should be saved.
	 * @return true if the file was successfully saved, false otherwise.
	 */
	
	public boolean processUploadedFile(byte[] fileData, String fileName, String uploadDir){
		if(fileData == null || fileName == null || fileName.trim().length() == 0 || uploadDir == null || uploadDir.trim().length() == 0){
			return false;
		}
		
		try{
			//Check if the directory exists, create it if it doesn't
			File directory = new File(uploadDir);
			if(!directory.exists()){
				directory.mkdirs();
			}
			String filePath = uploadDir + File.separator + fileName;
			File uploadedFile = new File(filePath);
			//Save the file to the specified directory
			FileOutputStream fos = new FileOutputStream(uploadedFile);
			fos.write(fileData);
			fos.close();
			System.out.println("File saved at path: "+filePath);
			return true;
		}
		catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	
}