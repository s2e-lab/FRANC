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
		    return clazz.getConstructor(new Class[0]).newInstance(new Object[0]);
		} catch (RuntimeException exp){
		    throw exp;
		} catch (IllegalArgumentException exp){
		    throw exp;
		} catch (InstantiationException exp){
		    throw exp;
		} catch (IllegalAccessException exp){
		    throw exp;
		} catch (InvocationTargetException exp){
		    throw exp;
		} catch (NoSuchMethodException exp){
		    throw exp;
		