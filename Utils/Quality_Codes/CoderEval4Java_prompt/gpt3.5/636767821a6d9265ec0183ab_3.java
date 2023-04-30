import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class LogRecord{
	/** 
	 * @return true if getThrown().toString() is a non-empty string.
	 */
	
	public boolean hasThrown(){
			return (thrown != null && thrown.toString().length() > 0); //checking if the thrown object is not null and has a non-empty string representation
	}
	
	//other methods and variables of the LogRecord class can be added here
	
	private Object thrown;
	public Object getThrown() {
		return thrown;
	}
	public void setThrown(Object thrown) {
		this.thrown = thrown;
	}

	
}