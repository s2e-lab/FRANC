import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class LogRecord{
	/** 
	 * @return true if getThrown().toString() is a non-empty string.
	 */
	
	public boolean hasThrown(){
			return thrown != null && !thrown.toString().isEmpty(); 
	}

	/**
	 * @return The log message.
	 */
	public String getMessage(){
		return message;
	}

	/**
	 * @return The Throwable associated with the log message.
	 */
	public Throwable getThrown(){
		return thrown;
	}

	/**
	 * Constructor method
	 * @param message The log message.
	 * @param thrown The Throwable associated with the log message.
	 */
	public LogRecord(String message, Throwable thrown){
		this.message = message;
		this.thrown = thrown;
	}

	private String message;
	private Throwable thrown;
}


class LogFormatter extends Formatter{
	/**
	 * Formats a log record in a readable format.
	 * @param record The log record.
	 * @return A String containing the formatted log record.
	 */
	public String format(LogRecord record){
		StringBuffer sb = new StringBuffer();
		sb.append(new Date(record.getMillis()).toString());
		sb.append(" ");
		sb.append(record.getMessage());
		sb.append("\n");
		if(record.hasThrown()){
			sb.append(record.getThrown().toString());
			sb.append("\n");
		}
		return sb.toString();
	}
}


class FileHandler extends Handler{
	/**
	 * Default constructor. Creates a FileHandler with file name "mylog.txt" and file size limit of 1024 bytes.
	 * @throws IOException
	 */
	public FileHandler() throws IOException{
		this("mylog.txt", 1024);
	}

	/**
	 * Constructor method with filename and file size limit arguments.
	 * @param filename The name of the log file.
	 * @param limit The maximum file size in bytes.
	 * @throws IOException
	 */
	public FileHandler(String filename, int limit) throws IOException{
		this.limit = limit;
		logFile = new File(filename);
		init();
	}

	/**
	 * Initialize the file and the PrintWriter.
	 * @throws IOException
	 */
	private void init() throws IOException{
		if(!logFile.exists()){
		    logFile.createNewFile();
	    }
		writer = new PrintWriter(new FileOutputStream(logFile, true));
	}

	/**
	 * Publish a log record to the file.
	 * @param record The log record.
	 */
	@Override
	public synchronized void publish(LogRecord record){
        if (isLoggable(record)) {
        	String message = getFormatter().format(record);
        	writer.print(message);
        	writer.flush();
		    checkFileSize();
        }
	}

}