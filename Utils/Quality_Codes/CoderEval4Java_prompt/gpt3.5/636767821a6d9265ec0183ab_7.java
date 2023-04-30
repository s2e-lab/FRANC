import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class LogRecord{
	/** 
	 * @return true if getThrown().toString() is a non-empty string.
	 */
	
	public boolean hasThrown(){
			if(getThrown() != null && getThrown().toString().trim().length() > 0){
				return true;
			}
			return false;
	}
	
	/**
	 * Returns the log message.
	 */
	public String getMessage(){
		return message;
	}
	
	/**
	 * Returns the throwable that was logged, if any.
	 */
	public Throwable getThrown(){
		return thrown;
	}
	
	/**
	 * Returns the date/time when the log entry was created.
	 */
	public Date getTimestamp(){
		return timestamp;
	}
	
	// Private fields
	private String message;
	private Throwable thrown;
	private Date timestamp;
} 
