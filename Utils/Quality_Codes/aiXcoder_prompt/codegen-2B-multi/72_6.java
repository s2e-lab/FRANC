import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID72{
	/**
	* Create an instance of a clazz using the current thread context ClassLoader.
	*/
	public static <T> T newInstance(Class<T> clazz){
		T instance = null;
		ClassLoader cl = Thread.currentThread().getContextClassLoader();
		try{
			instance = clazz.cast(cl.loadClass(clazz.getName()).newInstance());
		}catch (Exception e){
			System.out.println("Failed to instantiate Object");
			System.exit(1);
		}
		return instance;
	}
    
	Object[][] a(Object[] b) {
        int b = 3;
        int c[] = new int[b];;
}
}