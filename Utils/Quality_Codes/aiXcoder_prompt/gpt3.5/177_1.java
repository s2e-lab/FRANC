import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID177{
	/**
	* 获取当前进程的ID
	*/
	public static String getProcessId(){
			String processName =
java.lang.management.ManagementFactory.getRuntimeMXBean().getName();
String processId = processName.substring(0, processName.indexOf("@"));
return processId;
}

	/**
	* 主函数
	*/
	public static void main(String[] args){
		String processId = getProcessId();
		System.out.println("当前进程的ID是：" + processId);
	}
}