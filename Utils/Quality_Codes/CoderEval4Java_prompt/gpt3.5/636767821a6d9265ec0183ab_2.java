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
	 * @return a string representation of the log record, including the timestamp,
	 * log level, logger name, thread name, log message, and any thrown exception.
	 */
	public String toString(){
		StringBuilder builder = new StringBuilder();
		builder.append("[" + timestamp + "]");
		builder.append("[" + level.getName() + "]");
		builder.append("[" + loggerName + "]");
		builder.append("[" + threadName + "]");
		builder.append(" " + message);
		if(hasThrown()){
			builder.append(System.lineSeparator() + thrown.toString());
		}
		return builder.toString();
	}

	/**
	 * Private instance variables.
	 */
	private Date timestamp;
	private Level level;
	private String loggerName;
	private String message;
	private Throwable thrown;
	private String threadName;

	/**
	 * Constructor for LogRecord.
	 * @param level the logging level for the log record
	 * @param message the log message
	 * @param loggerName the name of the logger
	 */
	public LogRecord(Level level, String message, String loggerName){
		this.timestamp = new Date();
		this.level = level;
		this.loggerName = loggerName;
		this.message = message;
		this.thrown = null;
		this.threadName = Thread.currentThread().getName();
	}

	/**
	 * Set the throwable for the log record.
	 * @param thrown the throwable
	 */
	public void setThrown(Throwable thrown){
		this.thrown = thrown;
	}

	/**
	 * Enum for logging levels.
	 */
	public enum Level{
		DEBUG(Level.ALL),
		INFO(Level.CONFIG),
		WARNING(Level.WARNING),
		ERROR(Level.SEVERE);

		private int value;

		private Level(int value){
			this.value = value;
		}

		public int getValue(){
			return value;
		}

		public static Level parse(String name){
			switch(name.toUpperCase()){
				case "DEBUG": return DEBUG;
				case "INFO": return INFO;
				case "WARNING": return WARNING;
				case "ERROR": return ERROR;
				default: throw new IllegalArgumentException("No such level: " + name);
			}
		}
	}
}
