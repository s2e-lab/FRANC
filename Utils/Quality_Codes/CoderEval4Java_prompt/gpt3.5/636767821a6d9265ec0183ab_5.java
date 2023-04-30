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
	
	private Throwable thrown;
	
	public LogRecord(Throwable thrown){
		this.thrown = thrown;
	}
	
	public LogRecord(){
		this(null);
	}
	
	public int getLevel(){
		return level;
	}
	
	public void setLevel(int level){
		this.level = level;
	}
	
	public String getMessage(){
		return message;
	}
	
	public void setMessage(String message){
		this.message = message;
	}
	
	public Throwable getThrown(){
		return thrown;
	}
	
	public void setThrown(Throwable thrown){
		this.thrown = thrown;
	}
	
	private int level;
	private String message;
}
