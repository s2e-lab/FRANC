import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID177{
	/**
	* 获取当前进程的ID
	*/
	public static String getProcessId(){
			String processId = "";
	try {
		String processName = java.lang.management.ManagementFactory.getRuntimeMXBean().getName();
		processId = processName.split("@")[0];
	} catch (Exception e) {
		e.printStackTrace();
	}
	return processId;
}

public static void main(String[] args) {
	System.out.println("当前进程的ID为：" + getProcessId());
}
}