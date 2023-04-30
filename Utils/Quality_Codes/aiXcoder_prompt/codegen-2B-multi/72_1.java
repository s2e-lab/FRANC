import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID72{
	/**
	* Create an instance of a clazz using the current thread context ClassLoader.
	*/
	public static <T> T newInstance(Class<T> clazz){
		try{
			return clazz.cast(Class.forName(clazz.getName()).newInstance());
		} catch (Exception e) {
			throw new RuntimeException("Failed in creating an instance of " + clazz);
		}
	}

    public static void main(String[] args) throws IOException, ClassNotFoundException{
    	Scanner in = new Scanner(System.in);
        BufferedWriter bout = new BufferedWriter(new FileWriter("ids72.txt"));

        Random random = new Random();
}
}