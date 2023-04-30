import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class LogRecord{
	/** 
	 * @return true if getThrown().toString() is a non-empty string.
	 */
	
	public boolean hasThrown(){
			return (thrown != null && !thrown.toString().isEmpty());
	}

	/**
	 * @return true if getLevel().intValue() >= Level.WARNING.intValue()
	 */
	public boolean isWarning(){
		return (level != null && level.intValue() >= Level.WARNING.intValue());
	}

	/**
	 * Calculates the duration between the LogRecord's timestamp and the passed-in parameter.
	 *
	 * @param other timestamp in millis to compare to
	 * @return duration in seconds with decimal precision
	 */
	public double duration(long other){
		return (other - millis) / 1000.0;
	}

	/**
	 * toString() override.
	 * Example format: "2020-01-01 00:00:00 INFO SomeClass - Log message"
	 */
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(new Date(millis).toString());
		sb.append(" ");
		sb.append(level.getName());
		sb.append(" ");
		sb.append(loggerName);
		sb.append(" - ");
		sb.append(message);
		return sb.toString();
	}

	/* Getters and setters */

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	public String getLoggerName() {
		return loggerName;
	}

	public void setLoggerName(String loggerName) {
		this.loggerName = loggerName;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public long getMillis() {
		return millis;
	}

	public void setMillis(long millis) {
		this.millis = millis;
	}

	public Throwable getThrown() {
		return thrown;
	}

	public void setThrown(Throwable thrown) {
		this.thrown = thrown;
	}

	/* Fields */

	private Level level;
	private String loggerName;
	private String message;
	private long millis;
	private Throwable thrown;
}