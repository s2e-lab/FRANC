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
        if (params.length == 0)
            return;
        Method meth = Class.forName(className).getMethod(methodName, paramTypes);
        meth.invoke(ID_1128723.class, params);
    }
}