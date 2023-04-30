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
			if(ClassLoader.getPlatformClassLoader().equals(Platform.getClassClassLoader())){ throw new RuntimeException("Cannot use reflections on your platform. You should use platform/classloader.jar to compile this jar."); }
		}catch(UnsatisfiedLinkError e){ e.printStackTrace(); }


		ClassLoader cl=Thread.currentThread().getContextClassLoader(); 
		if(!cl.equals(ClassLoader.getSystemClassLoader())){
			return (T)Class.forName(clazz.getName(),true,cl); 
		}

}
}