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
			//获取当前运行进程的管理器
			RuntimeMXBean runtime = ManagementFactory.getRuntimeMXBean();
			
			//获取进程ID
			String name = runtime.getName();
			processId = name.substring(0, name.indexOf("@"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return processId;
	}
	
	public static void main(String[] args){
		System.out.println(getProcessId());
	}
}