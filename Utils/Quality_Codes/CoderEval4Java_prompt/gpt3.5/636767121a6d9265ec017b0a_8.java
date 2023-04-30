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
			return -1;
		}
		return index + 2;
	}
	
	/**
	 * Reads and parses the request headers from the input stream.
	 * @param is The input stream, from which the request headers are read.
	 * @return A map containing the request headers with their values.
	 */
	
	public Map<String,String> readHeaders(InputStream is) throws IOException{
		Map<String,String> headers = new HashMap<String,String>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		
		String line = br.readLine();
		while(line != null && line.length() > 0){
			int index = line.indexOf(":");
			if(index != -1){
				String key = line.substring(0,index);
				String value = line.substring(index+1).trim();
				headers.put(key,value);
			}
			line = br.readLine();
		}
		
		br.close();
		
		return headers;
	}
	
	/**
	 * Reads a file from the input stream and writes it to disk.
	 * @param is The input stream, from which the file is read.
	 * @param file The file, to which the content is written.
	 * @throws Exception
	 */
	
	public void writeFile(InputStream is, File file) throws Exception{
		BufferedInputStream bis = new BufferedInputStream(is);
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));
		
		byte[] buffer = new byte[1024];
		int length = 0;
		while((length = bis.read(buffer)) != -1){
			bos.write(buffer,0,length);
		}
		
		bis.close();
		bos.flush();
		bos.close();
	}
}