import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

class ID_520328{
    /**
     * Write a function to get all classes in a package.
     * 
     * Example:
     * getClasses("java.lang");
     * 
     * output:
     * class java.lang.Class
     * class java.lang.ClassLoader
     * class java.lang.ClassValue
     * ...
     */
    public static ArrayList<Class> getClasses(String packageName) throws Exception {