import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class LogRecord{
	/** 
	 * @return true if getThrown().toString() is a non-empty string.
	 */
	
	public boolean hasThrown(){
			return thrown != null && thrown.toString().trim().length() > 0;
	}

	/**
	 * Default constructor. Initializes the timestamp to the current time.
	 */
	public LogRecord() {
		this.timestamp = new Date().getTime();
	}

	/**
	 * Constructor with message, level and thrown exception.
	 * @param message the log message
	 * @param level the log level
	 * @param thrown the thrown exception
	 */
	public LogRecord(String message, Level level, Throwable thrown) {
		this();
		this.message = message;
		this.level = level;
		this.thrown = thrown;
	}

	/**
	 * @return the log message.
	 */
	public String getMessage(){
		return message;
	}

	/**
	 * @return the log level.
	 */
	public Level getLevel(){
		return level;
	}

	/**
	 * @return the timestamp of the log record.
	 */
	public long getTimestamp() {
		return timestamp;
	}

	/**
	 * @return the thrown exception.
	 */
	public Throwable getThrown(){
		return thrown;
	}

	/**
	 * The log message.
	 */
	private String message;

	/**
	 * The log level.
	 */
	private Level level;

	/**
	 * The thrown exception.
	 */
	private Throwable thrown;

	/**
	 * The timestamp of the log record.
	 */
	private long timestamp;
} 

/**
 * An enumeration of logging levels.
 */
enum Level {
	SEVERE,
	WARNING,
	INFO,
	CONFIG,
	FINE,
        FINER,
	FINEST
}