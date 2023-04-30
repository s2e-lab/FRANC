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
		while(i<headerPart.length()-1){
			if(headerPart.charAt(i)=='\r' && headerPart.charAt(i+1)=='\n'){
				return i+2;
			}
			i++;
		}
		//If end of line not found, return -1
		return -1;
	}

	/** 
	 * Parses the Content-Disposition header to extract the file name.
	 * @param contentDisposition The Content-Disposition header
	 * @return The file name, if present. Null otherwise.
	 */
	
	private String getFileName(String contentDisposition){
		StringTokenizer st = new StringTokenizer(contentDisposition, ";");
		while (st.hasMoreTokens()) {
			String token = st.nextToken().trim();
			if (token.startsWith("filename")) {
				return token.substring(token.indexOf("=") + 1).trim().replace("\"", "");
			}
		}
		return null;
	}

	/** 
	 * Handles file upload
	 * @param request HttpServletRequest object
	 * @param response HttpServletResponse object
	 * @return The name of the uploaded file, if successful. Null otherwise.
	 */
	
	public String handleUpload(HttpServletRequest request,HttpServletResponse response){
		String fileName = null;
		try {
			// Create a factory for disk-based file items
			DiskFileItemFactory factory = new DiskFileItemFactory();

			// Configure a repository (to ensure a secure temp location is used)
			File repository = new File(System.getProperty("java.io.tmpdir"));
			factory.setRepository(repository);

			// Create a new file upload handler
			ServletFileUpload upload = new ServletFileUpload(factory);

			// Parse the request
			List <FileItem> items = upload.parseRequest(request);
			

			// Process the uploaded items
			Iterator <FileItem> iter = items.iterator();
			while (iter.hasNext()) {
				FileItem item = iter.next();
				if (!item.isFormField()) {
					fileName = item.getName();
					// Handle file content
					InputStream uploadedStream = item.getInputStream();
					// Process the file
					uploadedStream.close();
				}
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		//Return file name, if successful. Null otherwise.
		return fileName;
	}
}