import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class LogRecord{
	/** 
	 * @return true if getThrown().toString() is a non-empty string.
	 */
	
	public boolean hasThrown(){
			return (thrown != null && thrown.toString().length() > 0);
	}
	
	private Throwable thrown; // the logged exception
    
	/** 
	 * Constructor for LogRecord class.
	 * @param level level of the log
	 * @param message message to be logged
	 */
	public LogRecord(Level level, String message){
		this.level = level;
		this.message = message;
		this.thrown = null; // no exception initially
	}
	
	/** 
	 * Constructor for LogRecord class with an exception to log.
	 * @param level level of the log
	 * @param message message to be logged
	 * @param thrown the exception to log
	 */
	public LogRecord(Level level, String message, Throwable thrown){
		this.level = level;
		this.message = message;
		this.thrown = thrown;
	}
	
	/**
	 * Get the level of this log record.
	 * @return the level of this log record
	 */
	public Level getLevel(){
		return level;
	}
	
	/**
	 * Get the message of this log record.
	 * @return the message of this log record
	 */
	public String getMessage(){
		return message;
	}
	
	/**
	 * Get the exception of this log record.
	 * @return the exception of this log record
	 */
	public Throwable getThrown(){
		return thrown;
	}
	
	private Level level; // the level of the log
	private String message; // the message to log
}