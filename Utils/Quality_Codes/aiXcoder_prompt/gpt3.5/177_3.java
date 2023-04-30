import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID177{
	/**
	* 获取当前进程的ID
	*/
	public static String getProcessId(){
			try{
	String processName = java.lang.management.ManagementFactory.getRuntimeMXBean().getName();
	String processId = processName.split("@")[0];
	return processId;
}catch(Exception e){
	return "Unable to get the process ID. Error Message: "+ e.getMessage();
}
}

public static void main(String[] args){
	String processId = getProcessId();
	System.out.println("Process ID: "+ processId);
}
}