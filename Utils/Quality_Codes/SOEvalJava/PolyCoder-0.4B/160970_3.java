import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.lang.reflect.*;

class ID_1128723{
    /**
     * Write a function to invoke a method by its name.
     * 
     * Example:
     * invokeMethod("ID_1128723", "main", new Class[]{String[].class}, new Object[]{new String[]{"Hello", "World"}});
     * 
     * output: Hello World
     */
    public static void invokeMethod(String className, String methodName, Class[] paramTypes, Object[] params) throws Exception {
        System.out.println("Running ID_1128723::" + className + methodName);
        int invocationCount = 0;
        // instantiate a test class and invoke method on it first
        Class<?> testClass = Class.forName(className);
        Object testMethod = testClass.getMethod(methodName);

        // invoke methods for each param
}
}