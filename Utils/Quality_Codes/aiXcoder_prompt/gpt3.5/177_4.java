import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID177{
	/**
	* 获取当前进程的ID
	*/
	public static String getProcessId(){
			String pid = "";
	try{
		String processName = java.lang.management.ManagementFactory.getRuntimeMXBean().getName();
		pid = processName.split("@")[0];
	}catch(Exception e){
		System.out.println("Failed to get process ID" + e);
	}
	return pid;
}

public static void main(String[] args){
	System.out.println("Current process ID: " + getProcessId());
}
}