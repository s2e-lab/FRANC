import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID124{
	/**
	* Appends an item to the list.
	*/
	public void append(List<String> list, String item){
		list.add(item);
	}

    /**
     * Returns "Hello, word".
     */
    public String hello(String s) {
        return "Hello, " + s + ".";
    }
	   
	public static void main(String[] args) {
		long time;
		boolean errors = false;
		ID124 activity = new ID124();

		time = System.currentTimeMillis();
		activity.append(new ArrayList<String>(), "first");
}
}