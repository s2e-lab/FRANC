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
        // write a function

        Class[] arguments = new Class[paramTypes.length + params.length];
        int argumentsRead = 0;
        int parametersCount = params.length;
        String[] parametersArray = new String[parametersCount];
        Object[] objectArray = new Object[parametersCount];
        Class returnType = null;
}
}