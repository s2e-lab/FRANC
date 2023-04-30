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
	 * Constructs a new LogRecord object with given parameters
	 * 
	 * @param level
	 *            The level of the LogRecord (e.g. Level.SEVERE)
	 * @param msg
	 *            The log message (can be null)
	 */
	public LogRecord(Level level, String msg) {
		this.level = level;
		this.message = msg;
		this.sourceClassName = null;
		this.sourceMethodName = null;
		this.paramArray = null;
		this.thrown = null;
		this.millis = System.currentTimeMillis();
		this.threadID = Thread.currentThread().getId();
	}

	/**
	 * Returns the log message
	 * 
	 * @return The log message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Sets the log message
	 * 
	 * @param message
	 *            The log message
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * Returns the source class name
	 * 
	 * @return The source class name
	 */
	public String getSourceClassName() {
		return sourceClassName;
	}

	/**
	 * Sets the source class name
	 * 
	 * @param sourceClassName
	 *            The source class name
	 */
	public void setSourceClassName(String sourceClassName) {
		this.sourceClassName = sourceClassName;
	}

	/**
	 * Returns the source method name
	 * 
	 * @return The source method name
	 */
	public String getSourceMethodName() {
		return sourceMethodName;
	}

	/**
	 * Sets the source method name
	 * 
	 * @param sourceMethodName
	 *            The source method name
	 */
	public void setSourceMethodName(String sourceMethodName) {
		this.sourceMethodName = sourceMethodName;
	}

	/**
	 * Returns the parameter array
	 * 
	 * @return The parameter array
	 */
	public Object[] getParameters() {
		return paramArray;
	}

	/**
	 * Sets the parameter array
	 * 
	 * @param parameters
	 *            The parameter array
	 */
	public void setParameters(Object[] parameters) {
		paramArray = parameters;
	}

	/**
	 * Returns the Level of the LogRecord
	 * 
	 * @return The Level of the LogRecord
	 */
	public Level getLevel() {
		return level;
	}

}